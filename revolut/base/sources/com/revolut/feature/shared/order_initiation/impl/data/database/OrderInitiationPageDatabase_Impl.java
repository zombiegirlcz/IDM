package com.revolut.feature.shared.order_initiation.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xad.a;
import xad.b;

/* JADX INFO: loaded from: classes7.dex */
public final class OrderInitiationPageDatabase_Impl extends OrderInitiationPageDatabase {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a f86441j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "order_initiation_pages");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "order_initiation_pages");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b(this);
    }

    @Override // com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase
    public final a g() {
        a aVar;
        if (this.f86441j != null) {
            return this.f86441j;
        }
        synchronized (this) {
            try {
                if (this.f86441j == null) {
                    this.f86441j = new a(this);
                }
                aVar = this.f86441j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
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
        map.put(a.class, Collections.EMPTY_LIST);
        return map;
    }
}
