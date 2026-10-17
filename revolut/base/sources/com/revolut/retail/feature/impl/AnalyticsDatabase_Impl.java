package com.revolut.retail.feature.impl;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lqj.c;
import psj.a;
import psj.b;
import qpj.e;
import qpj.f;
import qpj.h;
import qpj.i;
import qpj.j;
import qpj.k;
import qpj.l;
import qpj.m;
import qpj.n;
import qpj.o;
import qpj.p;
import qpj.q;
import qpj.r;
import wsj.d;
import wsj.g;

/* JADX INFO: loaded from: classes11.dex */
public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {
    public static final /* synthetic */ int o = 0;
    public volatile g f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f101494j;
    public volatile c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile qvj.c f101495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile a f101496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile b f101497n;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "income_sorters", "income_sorter_executions", "balance_history", "trips", "trips_metadata", "custom_assets", "field_definitions");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "income_sorters", "income_sorter_executions", "balance_history", "trips", "trips_metadata", "custom_assets", "field_definitions");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new r(this);
    }

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final lqj.a g() {
        c cVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new c(this);
                }
                cVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return cVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new n());
        arrayList.add(new o());
        arrayList.add(new p());
        arrayList.add(new q());
        arrayList.add(new qpj.b());
        arrayList.add(new qpj.c());
        arrayList.add(new qpj.d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new qpj.g());
        arrayList.add(new h());
        arrayList.add(new i());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(wsj.e.class, Arrays.asList(xsj.a.class, xsj.d.class));
        map.put(wsj.a.class, Arrays.asList(xsj.b.class, xsj.c.class));
        map.put(lqj.a.class, Collections.EMPTY_LIST);
        map.put(qvj.a.class, Arrays.asList(rvj.a.class));
        map.put(a.class, Arrays.asList(qsj.a.class, qsj.c.class));
        map.put(b.class, Arrays.asList(qsj.b.class));
        return map;
    }

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final a h() {
        a aVar;
        if (this.f101496m != null) {
            return this.f101496m;
        }
        synchronized (this) {
            try {
                if (this.f101496m == null) {
                    this.f101496m = new a(this);
                }
                aVar = this.f101496m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
    }

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final b i() {
        b bVar;
        if (this.f101497n != null) {
            return this.f101497n;
        }
        synchronized (this) {
            try {
                if (this.f101497n == null) {
                    this.f101497n = new b(this);
                }
                bVar = this.f101497n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
    }

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final wsj.a j() {
        d dVar;
        if (this.f101494j != null) {
            return this.f101494j;
        }
        synchronized (this) {
            try {
                if (this.f101494j == null) {
                    this.f101494j = new d(this);
                }
                dVar = this.f101494j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final wsj.e k() {
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

    @Override // com.revolut.retail.feature.impl.AnalyticsDatabase
    public final qvj.a l() {
        qvj.c cVar;
        if (this.f101495l != null) {
            return this.f101495l;
        }
        synchronized (this) {
            try {
                if (this.f101495l == null) {
                    this.f101495l = new qvj.c(this);
                }
                cVar = this.f101495l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return cVar;
    }
}
