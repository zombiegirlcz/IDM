package com.revolut.feature.transport.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tuf.a;
import tuf.b;
import tuf.c;
import tuf.d;
import vuf.h;
import vuf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class TransportDatabase_Impl extends TransportDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f92506j = 0;
    public volatile k f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "purchased_transit_tickets");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "purchased_transit_tickets");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new d(this);
    }

    @Override // com.revolut.feature.transport.impl.data.database.TransportDatabase
    public final h g() {
        k kVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new k(this);
                }
                kVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return kVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new c());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(h.class, Collections.EMPTY_LIST);
        return map;
    }
}
