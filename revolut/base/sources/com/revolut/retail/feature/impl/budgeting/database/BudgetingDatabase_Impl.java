package com.revolut.retail.feature.impl.budgeting.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xqj.b;
import yqj.a;
import yqj.c;
import yqj.d;
import yqj.e;

/* JADX INFO: loaded from: classes11.dex */
public final class BudgetingDatabase_Impl extends BudgetingDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile c f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile e f101499j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "budget_entity", "cached_budget");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "budget_entity", "cached_budget");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b(this);
    }

    @Override // com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase
    public final a g() {
        c cVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new c(this);
                }
                cVar = this.f;
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
        map.put(a.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase
    public final d h() {
        e eVar;
        if (this.f101499j != null) {
            return this.f101499j;
        }
        synchronized (this) {
            try {
                if (this.f101499j == null) {
                    this.f101499j = new e(this);
                }
                eVar = this.f101499j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }
}
