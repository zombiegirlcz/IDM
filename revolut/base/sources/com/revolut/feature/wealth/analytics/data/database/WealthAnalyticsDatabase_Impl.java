package com.revolut.feature.wealth.analytics.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lvg.a;
import mvg.b;
import mvg.c;
import nvg.a0;
import nvg.d;
import nvg.d0;
import nvg.e;
import nvg.e0;
import nvg.g0;
import nvg.h;
import nvg.h0;
import nvg.i;
import nvg.j0;
import nvg.k0;
import nvg.m;
import nvg.m0;
import nvg.n;
import nvg.n0;
import nvg.p;
import nvg.p0;
import nvg.q;
import nvg.q0;
import nvg.r;
import nvg.s;
import nvg.s0;
import nvg.t;
import nvg.t0;
import nvg.u;
import nvg.v0;
import nvg.w;
import nvg.x;
import nvg.z;

/* JADX INFO: loaded from: classes9.dex */
public final class WealthAnalyticsDatabase_Impl extends WealthAnalyticsDatabase {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f94973y = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile z f94974j;
    public volatile m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile d f94975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile h f94976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile m0 f94977n;
    public volatile t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile v0 f94978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile g0 f94979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile j0 f94980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile p0 f94981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile s0 f94982t;
    public volatile p u;
    public volatile w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile r f94983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile d0 f94984x;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "portfolio_performance_points", "portfolio_details_chart", "portfolio_details_chart_point", "contributors", "complex_analytics_contributors", "complex_analytics_combined_contributors", "complex_analytics_allocations", "complex_analytics_allocations_cash", "complex_analytics_allocations_assets", "complex_analytics_realised_pnl", "complex_analytics_combined_realised_pnl", "complex_analytics_total_value_chart", "complex_analytics_total_value_chart_point", "complex_analytics_performance_chart", "complex_analytics_performance_chart_point", "complex_analytics_pnl", "complex_analytics_pnl_point", "complex_analytics_sector_allocations", "complex_analytics_sector_allocations_assets", "complex_analytics_sector_contributors", "complex_analytics_combined_performance_chart", "complex_analytics_combined_performance_chart_point", "complex_analytics_combined_total_value_chart", "complex_analytics_combined_total_value_chart_point", "complex_analytics_combined_pnl_chart", "complex_analytics_combined_pnl_chart_point", "complex_analytics_dividends", "complex_analytics_combined_allocations", "complex_analytics_combined_allocations_cash", "complex_analytics_combined_allocations_assets");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "portfolio_performance_points", "portfolio_details_chart", "portfolio_details_chart_point", "contributors", "complex_analytics_contributors", "complex_analytics_combined_contributors", "complex_analytics_allocations", "complex_analytics_allocations_cash", "complex_analytics_allocations_assets", "complex_analytics_realised_pnl", "complex_analytics_combined_realised_pnl", "complex_analytics_total_value_chart", "complex_analytics_total_value_chart_point", "complex_analytics_performance_chart", "complex_analytics_performance_chart_point", "complex_analytics_pnl", "complex_analytics_pnl_point", "complex_analytics_sector_allocations", "complex_analytics_sector_allocations_assets", "complex_analytics_sector_contributors", "complex_analytics_combined_performance_chart", "complex_analytics_combined_performance_chart_point", "complex_analytics_combined_total_value_chart", "complex_analytics_combined_total_value_chart_point", "complex_analytics_combined_pnl_chart", "complex_analytics_combined_pnl_chart_point", "complex_analytics_dividends", "complex_analytics_combined_allocations", "complex_analytics_combined_allocations_cash", "complex_analytics_combined_allocations_assets");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final nvg.a g() {
        d dVar;
        if (this.f94975l != null) {
            return this.f94975l;
        }
        synchronized (this) {
            try {
                if (this.f94975l == null) {
                    this.f94975l = new d(this);
                }
                dVar = this.f94975l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
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
        map.put(mvg.a.class, list);
        map.put(b.class, list);
        map.put(c.class, list);
        map.put(x.class, list);
        map.put(i.class, list);
        map.put(nvg.a.class, list);
        map.put(e.class, list);
        map.put(k0.class, list);
        map.put(s.class, list);
        map.put(t0.class, list);
        map.put(e0.class, list);
        map.put(h0.class, list);
        map.put(n0.class, list);
        map.put(q0.class, list);
        map.put(n.class, list);
        map.put(u.class, list);
        map.put(q.class, list);
        map.put(a0.class, list);
        return map;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final e h() {
        h hVar;
        if (this.f94976m != null) {
            return this.f94976m;
        }
        synchronized (this) {
            try {
                if (this.f94976m == null) {
                    this.f94976m = new h(this);
                }
                hVar = this.f94976m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final i i() {
        m mVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new m(this);
                }
                mVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return mVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final n j() {
        p pVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new p(this);
                }
                pVar = this.u;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return pVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final q k() {
        r rVar;
        if (this.f94983w != null) {
            return this.f94983w;
        }
        synchronized (this) {
            try {
                if (this.f94983w == null) {
                    this.f94983w = new r(this);
                }
                rVar = this.f94983w;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return rVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final s l() {
        t tVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new t(this);
                }
                tVar = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return tVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final u m() {
        w wVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new w(this);
                }
                wVar = this.v;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return wVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final x n() {
        z zVar;
        if (this.f94974j != null) {
            return this.f94974j;
        }
        synchronized (this) {
            try {
                if (this.f94974j == null) {
                    this.f94974j = new z(this);
                }
                zVar = this.f94974j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zVar;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final a0 o() {
        d0 d0Var;
        if (this.f94984x != null) {
            return this.f94984x;
        }
        synchronized (this) {
            try {
                if (this.f94984x == null) {
                    this.f94984x = new d0(this);
                }
                d0Var = this.f94984x;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return d0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final e0 p() {
        g0 g0Var;
        if (this.f94979q != null) {
            return this.f94979q;
        }
        synchronized (this) {
            try {
                if (this.f94979q == null) {
                    this.f94979q = new g0(this);
                }
                g0Var = this.f94979q;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return g0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final h0 q() {
        j0 j0Var;
        if (this.f94980r != null) {
            return this.f94980r;
        }
        synchronized (this) {
            try {
                if (this.f94980r == null) {
                    this.f94980r = new j0(this);
                }
                j0Var = this.f94980r;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return j0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final k0 r() {
        m0 m0Var;
        if (this.f94977n != null) {
            return this.f94977n;
        }
        synchronized (this) {
            try {
                if (this.f94977n == null) {
                    this.f94977n = new m0(this);
                }
                m0Var = this.f94977n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return m0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final n0 s() {
        p0 p0Var;
        if (this.f94981s != null) {
            return this.f94981s;
        }
        synchronized (this) {
            try {
                if (this.f94981s == null) {
                    this.f94981s = new p0(this);
                }
                p0Var = this.f94981s;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return p0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final q0 t() {
        s0 s0Var;
        if (this.f94982t != null) {
            return this.f94982t;
        }
        synchronized (this) {
            try {
                if (this.f94982t == null) {
                    this.f94982t = new s0(this);
                }
                s0Var = this.f94982t;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return s0Var;
    }

    @Override // com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase
    public final t0 u() {
        v0 v0Var;
        if (this.f94978p != null) {
            return this.f94978p;
        }
        synchronized (this) {
            try {
                if (this.f94978p == null) {
                    this.f94978p = new v0(this);
                }
                v0Var = this.f94978p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return v0Var;
    }
}
