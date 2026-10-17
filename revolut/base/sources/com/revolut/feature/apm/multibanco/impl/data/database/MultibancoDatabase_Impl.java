package com.revolut.feature.apm.multibanco.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import b72.a;
import c72.d;
import c72.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class MultibancoDatabase_Impl extends MultibancoDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f62560j = 0;
    public volatile f f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "apm_multibanco_withdrawal_code");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "apm_multibanco_withdrawal_code");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.apm.multibanco.impl.data.database.MultibancoDatabase
    public final d g() {
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
        map.put(d.class, Collections.EMPTY_LIST);
        return map;
    }
}
