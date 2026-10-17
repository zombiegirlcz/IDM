package com.revolut.feature.shared.airtip.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import g5d.d;
import g5d.g;
import g5d.h;
import g5d.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class AirTipDatabase_Impl extends AirTipDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f86031j = 0;
    public volatile g f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "air_tip_state");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "air_tip_state");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new i(this);
    }

    @Override // com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase
    public final d g() {
        g gVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new g(this);
                }
                gVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h());
        arrayList.add(new a());
        return arrayList;
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
