package com.revolut.feature.account_switching.impl.data.storage;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import is6.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m91.a;
import m91.b;
import m91.c;
import m91.d;
import m91.e;
import m91.f;
import m91.h;
import m91.i;
import m91.j;
import m91.k;
import m91.l;
import m91.m;
import m91.o;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountSwitchingDatabase_Impl extends AccountSwitchingDatabase {
    public static final /* synthetic */ int o = 0;
    public volatile o f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile h f60560j;
    public volatile b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f60561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile j f60562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile l f60563n;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "pae_source_bank_details_table", "pae_direct_debits_table", "pae_scheduled_payments_table", "pae_scheduled_payment_overridden_data_table", "pae_incoming_payments_table", "pae_payment_address_table", "pae_payment_overridden_names_table", "pae_payment_required_attributes_table", "pae_payment_required_attribute_values_table");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "pae_source_bank_details_table", "pae_direct_debits_table", "pae_scheduled_payments_table", "pae_scheduled_payment_overridden_data_table", "pae_incoming_payments_table", "pae_payment_address_table", "pae_payment_overridden_names_table", "pae_payment_required_attributes_table", "pae_payment_required_attribute_values_table");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new c(this);
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final a g() {
        b bVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    b bVar2 = new b();
                    new x(8);
                    this.k = bVar2;
                }
                bVar = this.k;
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
        map.put(m.class, list);
        map.put(f.class, list);
        map.put(a.class, list);
        map.put(d.class, list);
        map.put(i.class, list);
        map.put(k.class, list);
        return map;
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final d h() {
        e eVar;
        if (this.f60561l != null) {
            return this.f60561l;
        }
        synchronized (this) {
            try {
                if (this.f60561l == null) {
                    e eVar2 = new e();
                    new x(9);
                    this.f60561l = eVar2;
                }
                eVar = this.f60561l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final f i() {
        h hVar;
        if (this.f60560j != null) {
            return this.f60560j;
        }
        synchronized (this) {
            try {
                if (this.f60560j == null) {
                    this.f60560j = new h(this);
                }
                hVar = this.f60560j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final i j() {
        j jVar;
        if (this.f60562m != null) {
            return this.f60562m;
        }
        synchronized (this) {
            try {
                if (this.f60562m == null) {
                    j jVar2 = new j();
                    new x(14);
                    this.f60562m = jVar2;
                }
                jVar = this.f60562m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final k k() {
        l lVar;
        if (this.f60563n != null) {
            return this.f60563n;
        }
        synchronized (this) {
            try {
                if (this.f60563n == null) {
                    l lVar2 = new l();
                    new x(15);
                    this.f60563n = lVar2;
                }
                lVar = this.f60563n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }

    @Override // com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase
    public final m l() {
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
}
