package com.revolut.feature.rev_points.impl.data.storage.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sxb.a;
import sxb.b;
import sxb.e;
import sxb.f;
import sxb.g;

/* JADX INFO: loaded from: classes6.dex */
public final class RevPointsDatabase_Impl extends RevPointsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile g f83734j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "rev_points_transaction", "rev_points_transaction_metadata");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rev_points_transaction", "rev_points_transaction_metadata");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase
    public final b g() {
        e eVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new e(this);
                }
                eVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(b.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase
    public final f h() {
        g gVar;
        if (this.f83734j != null) {
            return this.f83734j;
        }
        synchronized (this) {
            try {
                if (this.f83734j == null) {
                    this.f83734j = new g(this);
                }
                gVar = this.f83734j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }
}
