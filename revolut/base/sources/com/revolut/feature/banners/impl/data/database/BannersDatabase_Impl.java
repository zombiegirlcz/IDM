package com.revolut.feature.banners.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import dcl.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mq2.a;
import ofg.i;
import oq2.b;

/* JADX INFO: loaded from: classes21.dex */
public final class BannersDatabase_Impl extends BannersDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f64087j = 0;
    public volatile b f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "banners_keys", "banners_closed_ids", "banners", "banners_keys_relations");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "banners_keys", "banners_closed_ids", "banners", "banners_keys_relations");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.banners.impl.data.database.BannersDatabase
    public final oq2.a g() {
        b bVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    b bVar2 = new b();
                    new i(1);
                    new i(2);
                    new i(bVar2, 3);
                    new i(4);
                    new g0(15);
                    new g0(16);
                    this.f = bVar2;
                }
                bVar = this.f;
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
        map.put(oq2.a.class, Collections.EMPTY_LIST);
        return map;
    }
}
