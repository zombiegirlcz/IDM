package com.revolut.feature.credit.loan.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m45.a;
import m45.b;
import m45.f;
import m45.h;
import m45.i;
import m45.j;
import m45.k;
import m45.l;
import m45.m;
import m45.n;
import n45.c;
import n45.d;
import n45.e;
import n45.g;

/* JADX INFO: loaded from: classes13.dex */
public final class LoanDatabase_Impl extends LoanDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f70308m = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile g f70309j;
    public volatile c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile d f70310l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "statement_documents", "update_dates", "loan_preferences", "loan_refinanced_credits_v2", "loans", "loan_details_shard", "loan_repayments");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "statement_documents", "update_dates", "loan_preferences", "loan_refinanced_credits_v2", "loans", "loan_details_shard", "loan_repayments");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new n(this);
    }

    @Override // com.revolut.feature.credit.loan.impl.database.LoanDatabase
    public final c g() {
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
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new m45.c());
        arrayList.add(new m45.d());
        arrayList.add(new m45.e());
        arrayList.add(new f());
        arrayList.add(new m45.g());
        arrayList.add(new h());
        arrayList.add(new i());
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
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
        map.put(e.class, list);
        map.put(n45.f.class, list);
        map.put(c.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.feature.credit.loan.impl.database.LoanDatabase
    public final d h() {
        d dVar;
        if (this.f70310l != null) {
            return this.f70310l;
        }
        synchronized (this) {
            try {
                if (this.f70310l == null) {
                    this.f70310l = new d(this);
                }
                dVar = this.f70310l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.feature.credit.loan.impl.database.LoanDatabase
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

    @Override // com.revolut.feature.credit.loan.impl.database.LoanDatabase
    public final n45.f j() {
        g gVar;
        if (this.f70309j != null) {
            return this.f70309j;
        }
        synchronized (this) {
            try {
                if (this.f70309j == null) {
                    this.f70309j = new g(this);
                }
                gVar = this.f70309j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }
}
