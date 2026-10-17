package com.revolut.feature.freelancer.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import is6.a;
import is6.c;
import is6.d;
import is6.e;
import is6.f;
import is6.g;
import is6.h;
import is6.i;
import is6.j;
import is6.k;
import is6.l;
import is6.m;
import is6.n;
import is6.o;
import is6.p;
import is6.q;
import is6.r;
import is6.s;
import is6.u;
import is6.y;
import is6.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class FreelancerDatabase_Impl extends FreelancerDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f73510p = 0;
    public volatile a f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile c f73511j;
    public volatile d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f73512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile y f73513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile u f73514n;
    public volatile z o;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "acquiring_orders", "acquiring_payments", "business_category", "customers", "invoices", "invoice_tax_rates", "orders");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "acquiring_orders", "acquiring_payments", "business_category", "customers", "invoices", "invoice_tax_rates", "orders");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new s(this);
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final a g() {
        a aVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new a(this);
                }
                aVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new n());
        arrayList.add(new o());
        arrayList.add(new p());
        arrayList.add(new q());
        arrayList.add(new r());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(a.class, list);
        map.put(c.class, list);
        map.put(d.class, list);
        map.put(e.class, list);
        map.put(y.class, list);
        map.put(u.class, list);
        map.put(z.class, list);
        return map;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final c h() {
        c cVar;
        if (this.f73511j != null) {
            return this.f73511j;
        }
        synchronized (this) {
            try {
                if (this.f73511j == null) {
                    this.f73511j = new c(this);
                }
                cVar = this.f73511j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return cVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final d i() {
        d dVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new d(this);
                }
                dVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final e j() {
        e eVar;
        if (this.f73512l != null) {
            return this.f73512l;
        }
        synchronized (this) {
            try {
                if (this.f73512l == null) {
                    this.f73512l = new e(this);
                }
                eVar = this.f73512l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final u k() {
        u uVar;
        if (this.f73514n != null) {
            return this.f73514n;
        }
        synchronized (this) {
            try {
                if (this.f73514n == null) {
                    this.f73514n = new u(this);
                }
                uVar = this.f73514n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return uVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final y l() {
        y yVar;
        if (this.f73513m != null) {
            return this.f73513m;
        }
        synchronized (this) {
            try {
                if (this.f73513m == null) {
                    this.f73513m = new y(this);
                }
                yVar = this.f73513m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return yVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.FreelancerDatabase
    public final z m() {
        z zVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new z(this);
                }
                zVar = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zVar;
    }
}
