package com.revolut.feature.donations.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import ha6.a;
import ja6.b;
import ja6.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class DonationsDatabase_Impl extends DonationsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile f f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile b f71989j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "charity", "charity_collections", "charity_campaigns");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "charity", "charity_collections", "charity_campaigns");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.donations.impl.database.DonationsDatabase
    public final b g() {
        b bVar;
        if (this.f71989j != null) {
            return this.f71989j;
        }
        synchronized (this) {
            try {
                if (this.f71989j == null) {
                    this.f71989j = new b(this);
                }
                bVar = this.f71989j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
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
        map.put(f.class, list);
        map.put(b.class, list);
        return map;
    }

    @Override // com.revolut.feature.donations.impl.database.DonationsDatabase
    public final f h() {
        f fVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new f(this);
                }
                fVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }
}
