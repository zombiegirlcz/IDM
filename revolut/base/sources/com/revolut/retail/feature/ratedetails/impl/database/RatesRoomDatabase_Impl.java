package com.revolut.retail.feature.ratedetails.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import dcl.g0;
import dcl.s0;
import fpk.c;
import fpk.e;
import fpk.h;
import ipk.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jpk.d;

/* JADX INFO: loaded from: classes13.dex */
public final class RatesRoomDatabase_Impl extends RatesRoomDatabase {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f103719n = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile c f103720j;
    public volatile ipk.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile gpk.c f103721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile d f103722m;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "mid_rates_cache", "all_rates", "mid_rates_plot", "rates_alerts", "candles_cryptocommodities_chart", "candles_cryptocommodities_point");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "mid_rates_cache", "all_rates", "mid_rates_plot", "rates_alerts", "candles_cryptocommodities_chart", "candles_cryptocommodities_point");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new h(this);
    }

    @Override // com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase
    public final c g() {
        c cVar;
        if (this.f103720j != null) {
            return this.f103720j;
        }
        synchronized (this) {
            try {
                if (this.f103720j == null) {
                    this.f103720j = new c(this);
                }
                cVar = this.f103720j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return cVar;
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
        map.put(e.class, list);
        map.put(c.class, list);
        map.put(b.class, list);
        map.put(gpk.c.class, list);
        map.put(jpk.c.class, list);
        return map;
    }

    @Override // com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase
    public final jpk.c h() {
        d dVar;
        if (this.f103722m != null) {
            return this.f103722m;
        }
        synchronized (this) {
            try {
                if (this.f103722m == null) {
                    this.f103722m = new d(this);
                }
                dVar = this.f103722m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase
    public final e i() {
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

    @Override // com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase
    public final b j() {
        ipk.e eVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new ipk.e(this);
                }
                eVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase
    public final gpk.c k() {
        gpk.c cVar;
        if (this.f103721l != null) {
            return this.f103721l;
        }
        synchronized (this) {
            try {
                if (this.f103721l == null) {
                    gpk.c cVar2 = new gpk.c();
                    cVar2.f145463a = this;
                    cVar2.f145464b = new s0(16);
                    cVar2.f145465c = new g0(5);
                    this.f103721l = cVar2;
                }
                cVar = this.f103721l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return cVar;
    }
}
