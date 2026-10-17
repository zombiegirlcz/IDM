package com.revolut.feature.transactions.impl.data.new_arch.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lif.a;
import lif.a0;
import lif.a1;
import lif.b0;
import lif.b1;
import lif.c;
import lif.c0;
import lif.d0;
import lif.e;
import lif.e0;
import lif.f;
import lif.f0;
import lif.g0;
import lif.h0;
import lif.i;
import lif.i0;
import lif.j0;
import lif.k;
import lif.k0;
import lif.l;
import lif.l0;
import lif.m;
import lif.m0;
import lif.n;
import lif.n0;
import lif.o;
import lif.o0;
import lif.p;
import lif.p0;
import lif.q;
import lif.q0;
import lif.r;
import lif.r0;
import lif.s0;
import lif.t;
import lif.t0;
import lif.u;
import lif.u0;
import lif.v;
import lif.v0;
import lif.w;
import lif.w0;
import lif.x;
import lif.x0;
import lif.y;
import lif.y0;
import lif.z;
import lif.z0;
import mif.b;
import mif.d;
import mif.g;
import mif.h;
import mif.j;
import mif.s;

/* JADX INFO: loaded from: classes13.dex */
public final class TransactionsDatabase_Impl extends TransactionsDatabase {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f92033n = 0;
    public volatile s f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile j f92034j;
    public volatile d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile g f92035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile h f92036m;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "transactions", "transaction_details", "transfer_users", "merchants", "merchant_payments", "acquiring_cashback", "loans", "extra_attributes", "hidden", "excluded_transactions", "loading_state", "crypto_deposits", "defi_metadata", "calculated_balance_state", "search_indexes", "search_index_state");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        HashMap map = new HashMap(1);
        map.put("search_indexes", "search_indexes_content");
        return new InvalidationTracker(this, map, new HashMap(0), "transactions", "transaction_details", "transfer_users", "merchants", "merchant_payments", "acquiring_cashback", "loans", "extra_attributes", "hidden", "excluded_transactions", "loading_state", "crypto_deposits", "defi_metadata", "calculated_balance_state", "search_indexes", "search_index_state");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b1(this);
    }

    @Override // com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase
    public final b g() {
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

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lif.j());
        arrayList.add(new u());
        arrayList.add(new x0());
        arrayList.add(new y0());
        arrayList.add(new z0());
        arrayList.add(new a1());
        arrayList.add(new a());
        arrayList.add(new lif.b());
        arrayList.add(new c());
        arrayList.add(new lif.d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new lif.g());
        arrayList.add(new lif.h());
        arrayList.add(new i());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new n());
        arrayList.add(new o());
        arrayList.add(new p());
        arrayList.add(new q());
        arrayList.add(new r());
        arrayList.add(new lif.s());
        arrayList.add(new t());
        arrayList.add(new v());
        arrayList.add(new w());
        arrayList.add(new x());
        arrayList.add(new y());
        arrayList.add(new z());
        arrayList.add(new a0());
        arrayList.add(new b0());
        arrayList.add(new c0());
        arrayList.add(new d0());
        arrayList.add(new e0());
        arrayList.add(new f0());
        arrayList.add(new g0());
        arrayList.add(new h0());
        arrayList.add(new i0());
        arrayList.add(new j0());
        arrayList.add(new k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new n0());
        arrayList.add(new o0());
        arrayList.add(new p0());
        arrayList.add(new q0());
        arrayList.add(new r0());
        arrayList.add(new s0());
        arrayList.add(new t0());
        arrayList.add(new u0());
        arrayList.add(new v0());
        arrayList.add(new w0());
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
        map.put(mif.o.class, list);
        map.put(j.class, list);
        map.put(b.class, list);
        map.put(mif.f.class, list);
        mif.a.p();
        map.put(mif.a.class, list);
        h.a();
        map.put(h.class, list);
        return map;
    }

    @Override // com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase
    public final mif.f h() {
        g gVar;
        if (this.f92035l != null) {
            return this.f92035l;
        }
        synchronized (this) {
            try {
                if (this.f92035l == null) {
                    this.f92035l = new g(this);
                }
                gVar = this.f92035l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase
    public final h i() {
        h hVar;
        if (this.f92036m != null) {
            return this.f92036m;
        }
        synchronized (this) {
            try {
                if (this.f92036m == null) {
                    this.f92036m = new h(this);
                }
                hVar = this.f92036m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase
    public final j j() {
        j jVar;
        if (this.f92034j != null) {
            return this.f92034j;
        }
        synchronized (this) {
            try {
                if (this.f92034j == null) {
                    this.f92034j = new j(this);
                }
                jVar = this.f92034j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }

    @Override // com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase
    public final mif.o k() {
        s sVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new s(this);
                }
                sVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return sVar;
    }
}
