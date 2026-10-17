package com.revolut.shared.feature.wealth.domain.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import ccl.a;
import dcl.a0;
import dcl.c;
import dcl.c0;
import dcl.d;
import dcl.d0;
import dcl.e;
import dcl.f;
import dcl.g;
import dcl.h;
import dcl.h0;
import dcl.i;
import dcl.i0;
import dcl.j;
import dcl.j0;
import dcl.k;
import dcl.k0;
import dcl.l;
import dcl.l0;
import dcl.m;
import dcl.n;
import dcl.n0;
import dcl.o;
import dcl.o0;
import dcl.p;
import dcl.p0;
import dcl.q;
import dcl.q0;
import dcl.r;
import dcl.r0;
import dcl.s;
import dcl.t;
import dcl.t0;
import dcl.u0;
import dcl.v;
import dcl.v0;
import dcl.w;
import dcl.w0;
import dcl.x;
import dcl.y;
import dcl.y0;
import dcl.z;
import ecl.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class WealthDomainDatabase_Impl extends WealthDomainDatabase {
    public static final /* synthetic */ int I = 0;
    public volatile p A;
    public volatile v B;
    public volatile q C;
    public volatile d D;
    public volatile j E;
    public volatile l0 F;
    public volatile n0 G;
    public volatile o0 H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile c0 f105076j;
    public volatile h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile y0 f105077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile b f105078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile ecl.d f105079n;
    public volatile v0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile n f105080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile dcl.b f105081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile f f105082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile h f105083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile l f105084t;
    public volatile q0 u;
    public volatile t0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile j0 f105085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile z f105086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile x f105087y;
    public volatile s z;

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final r0 A() {
        t0 t0Var;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new t0(this);
                }
                t0Var = this.v;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return t0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final u0 B() {
        v0 v0Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new v0(this);
                }
                v0Var = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return v0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final w0 C() {
        y0 y0Var;
        if (this.f105077l != null) {
            return this.f105077l;
        }
        synchronized (this) {
            try {
                if (this.f105077l == null) {
                    this.f105077l = new y0(this);
                }
                y0Var = this.f105077l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return y0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final b D() {
        b bVar;
        if (this.f105078m != null) {
            return this.f105078m;
        }
        synchronized (this) {
            try {
                if (this.f105078m == null) {
                    this.f105078m = new b(this);
                }
                bVar = this.f105078m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final ecl.d E() {
        ecl.d dVar;
        if (this.f105079n != null) {
            return this.f105079n;
        }
        synchronized (this) {
            try {
                if (this.f105079n == null) {
                    this.f105079n = new ecl.d(this);
                }
                dVar = this.f105079n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "recently_viewed_instrument", "instruments", "instrument_tickers", "instrument_tickers_summary", "portfolioSettings", "reports", "us_reports", "portfolios", "holdings", "bond_details", "cfd_details", "etf_details", "instrument_details", "fund_details", "mutual_fund_details", "instrument_details_recommendations", "instrument_governance", "stocks_historical_rates", "candle_sticks", "instrument_drawdown", "bond_stats", "etf_stats", "instrument_stats", "note_details", "ipo_instrument_details", "ipo_instrument_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "recently_viewed_instrument", "instruments", "instrument_tickers", "instrument_tickers_summary", "portfolioSettings", "reports", "us_reports", "portfolios", "holdings", "bond_details", "cfd_details", "etf_details", "instrument_details", "fund_details", "mutual_fund_details", "instrument_details_recommendations", "instrument_governance", "stocks_historical_rates", "candle_sticks", "instrument_drawdown", "bond_stats", "etf_stats", "instrument_stats", "note_details", "ipo_instrument_details", "ipo_instrument_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final dcl.a g() {
        dcl.b bVar;
        if (this.f105081q != null) {
            return this.f105081q;
        }
        synchronized (this) {
            try {
                if (this.f105081q == null) {
                    this.f105081q = new dcl.b(this);
                }
                bVar = this.f105081q;
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
        List list = Collections.EMPTY_LIST;
        map.put(a0.class, list);
        map.put(d0.class, list);
        map.put(w0.class, list);
        map.put(b.class, list);
        map.put(ecl.d.class, list);
        map.put(u0.class, list);
        map.put(m.class, list);
        map.put(dcl.a.class, list);
        map.put(e.class, list);
        map.put(g.class, list);
        map.put(k.class, list);
        map.put(p0.class, list);
        map.put(r0.class, list);
        map.put(i0.class, list);
        map.put(y.class, list);
        map.put(w.class, list);
        map.put(r.class, list);
        map.put(o.class, list);
        map.put(t.class, list);
        map.put(q.class, list);
        map.put(c.class, list);
        map.put(i.class, list);
        map.put(k0.class, list);
        map.put(n0.class, list);
        map.put(o0.class, list);
        return map;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final c h() {
        d dVar;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new d(this);
                }
                dVar = this.D;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final o i() {
        p pVar;
        if (this.A != null) {
            return this.A;
        }
        synchronized (this) {
            try {
                if (this.A == null) {
                    this.A = new p(this);
                }
                pVar = this.A;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return pVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final e j() {
        f fVar;
        if (this.f105082r != null) {
            return this.f105082r;
        }
        synchronized (this) {
            try {
                if (this.f105082r == null) {
                    this.f105082r = new f(this);
                }
                fVar = this.f105082r;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final g k() {
        h hVar;
        if (this.f105083s != null) {
            return this.f105083s;
        }
        synchronized (this) {
            try {
                if (this.f105083s == null) {
                    this.f105083s = new h(this);
                }
                hVar = this.f105083s;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final i l() {
        j jVar;
        if (this.E != null) {
            return this.E;
        }
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new j(this);
                }
                jVar = this.E;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final k m() {
        l lVar;
        if (this.f105084t != null) {
            return this.f105084t;
        }
        synchronized (this) {
            try {
                if (this.f105084t == null) {
                    this.f105084t = new l(this);
                }
                lVar = this.f105084t;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final m n() {
        n nVar;
        if (this.f105080p != null) {
            return this.f105080p;
        }
        synchronized (this) {
            try {
                if (this.f105080p == null) {
                    this.f105080p = new n(this);
                }
                nVar = this.f105080p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return nVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final i0 o() {
        j0 j0Var;
        if (this.f105085w != null) {
            return this.f105085w;
        }
        synchronized (this) {
            try {
                if (this.f105085w == null) {
                    this.f105085w = new j0(this);
                }
                j0Var = this.f105085w;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return j0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final q p() {
        q qVar;
        if (this.C != null) {
            return this.C;
        }
        synchronized (this) {
            try {
                if (this.C == null) {
                    q qVar2 = new q();
                    new ark.c(qVar2, 16);
                    this.C = qVar2;
                }
                qVar = this.C;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return qVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final r q() {
        s sVar;
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            try {
                if (this.z == null) {
                    this.z = new s(this);
                }
                sVar = this.z;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return sVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final t r() {
        v vVar;
        if (this.B != null) {
            return this.B;
        }
        synchronized (this) {
            try {
                if (this.B == null) {
                    this.B = new v(this);
                }
                vVar = this.B;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return vVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final w s() {
        x xVar;
        if (this.f105087y != null) {
            return this.f105087y;
        }
        synchronized (this) {
            try {
                if (this.f105087y == null) {
                    this.f105087y = new x(this);
                }
                xVar = this.f105087y;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return xVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final y t() {
        z zVar;
        if (this.f105086x != null) {
            return this.f105086x;
        }
        synchronized (this) {
            try {
                if (this.f105086x == null) {
                    this.f105086x = new z(this);
                }
                zVar = this.f105086x;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zVar;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final a0 u() {
        c0 c0Var;
        if (this.f105076j != null) {
            return this.f105076j;
        }
        synchronized (this) {
            try {
                if (this.f105076j == null) {
                    this.f105076j = new c0(this);
                }
                c0Var = this.f105076j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return c0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final d0 v() {
        h0 h0Var;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new h0(this);
                }
                h0Var = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return h0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final k0 w() {
        l0 l0Var;
        if (this.F != null) {
            return this.F;
        }
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new l0(this);
                }
                l0Var = this.F;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return l0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final n0 x() {
        n0 n0Var;
        if (this.G != null) {
            return this.G;
        }
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = new n0(this);
                }
                n0Var = this.G;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return n0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final o0 y() {
        o0 o0Var;
        if (this.H != null) {
            return this.H;
        }
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = new o0(this);
                }
                o0Var = this.H;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return o0Var;
    }

    @Override // com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase
    public final p0 z() {
        q0 q0Var;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new q0(this);
                }
                q0Var = this.u;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return q0Var;
    }
}
