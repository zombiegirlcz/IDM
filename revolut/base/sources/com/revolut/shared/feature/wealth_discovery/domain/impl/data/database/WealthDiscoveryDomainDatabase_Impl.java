package com.revolut.shared.feature.wealth_discovery.domain.impl.data.database;

import ahl.c;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import bhl.d;
import bhl.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class WealthDiscoveryDomainDatabase_Impl extends WealthDiscoveryDomainDatabase {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile e f105369j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "entities_adt");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "entities_adt");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new c(this);
    }

    @Override // com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase
    public final d g() {
        e eVar;
        if (this.f105369j != null) {
            return this.f105369j;
        }
        synchronized (this) {
            try {
                if (this.f105369j == null) {
                    this.f105369j = new e(this);
                }
                eVar = this.f105369j;
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
        map.put(d.class, Collections.EMPTY_LIST);
        return map;
    }
}
