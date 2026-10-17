package com.revolut.feature.payments.groups.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wq9.a;
import yq9.b;
import yq9.c;
import yq9.e;
import yq9.h;
import yq9.i;
import yq9.l;
import yq9.o;

/* JADX INFO: loaded from: classes13.dex */
public final class PaymentsGroupsDatabase_Impl extends PaymentsGroupsDatabase {
    public static final /* synthetic */ int o = 0;
    public volatile h f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile l f79316j;
    public volatile c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f79317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile o f79318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile i f79319n;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "payments_groups", "payments_groups_members", "payments_groups_bills", "payments_groups_bills_splits", "payments_groups_settlements", "payments_groups_debts");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "payments_groups", "payments_groups_members", "payments_groups_bills", "payments_groups_bills_splits", "payments_groups_settlements", "payments_groups_debts");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final b g() {
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
        map.put(h.class, list);
        map.put(l.class, list);
        map.put(b.class, list);
        map.put(e.class, list);
        map.put(o.class, list);
        map.put(i.class, list);
        return map;
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final e h() {
        e eVar;
        if (this.f79317l != null) {
            return this.f79317l;
        }
        synchronized (this) {
            try {
                if (this.f79317l == null) {
                    this.f79317l = new e(this);
                }
                eVar = this.f79317l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final h i() {
        h hVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new h(this);
                }
                hVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final i j() {
        i iVar;
        if (this.f79319n != null) {
            return this.f79319n;
        }
        synchronized (this) {
            try {
                if (this.f79319n == null) {
                    this.f79319n = new i(this);
                }
                iVar = this.f79319n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return iVar;
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final l k() {
        l lVar;
        if (this.f79316j != null) {
            return this.f79316j;
        }
        synchronized (this) {
            try {
                if (this.f79316j == null) {
                    this.f79316j = new l(this);
                }
                lVar = this.f79316j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }

    @Override // com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase
    public final o l() {
        o oVar;
        if (this.f79318m != null) {
            return this.f79318m;
        }
        synchronized (this) {
            try {
                if (this.f79318m == null) {
                    this.f79318m = new o(this);
                }
                oVar = this.f79318m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return oVar;
    }
}
