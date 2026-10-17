package com.revolut.feature.slot_manager.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okd.b;
import okd.c;

/* JADX INFO: loaded from: classes13.dex */
public final class SlotManagerDatabase_Impl extends SlotManagerDatabase {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile b f87351j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "slot_actions");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "slot_actions");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new c(this);
    }

    @Override // com.revolut.feature.slot_manager.impl.database.SlotManagerDatabase
    public final b g() {
        b bVar;
        if (this.f87351j != null) {
            return this.f87351j;
        }
        synchronized (this) {
            try {
                if (this.f87351j == null) {
                    this.f87351j = new b(this);
                }
                bVar = this.f87351j;
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
        map.put(b.class, Collections.EMPTY_LIST);
        return map;
    }
}
