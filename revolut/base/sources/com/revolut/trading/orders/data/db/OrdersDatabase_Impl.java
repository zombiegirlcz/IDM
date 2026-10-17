package com.revolut.trading.orders.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import irl.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import krl.l;
import krl.o;

/* JADX INFO: loaded from: classes12.dex */
public final class OrdersDatabase_Impl extends OrdersDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f106799j = 0;
    public volatile o f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "invest_orders");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "invest_orders");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.trading.orders.data.db.OrdersDatabase
    public final l g() {
        o oVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new o(this);
                }
                oVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return oVar;
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
        map.put(l.class, Collections.EMPTY_LIST);
        return map;
    }
}
