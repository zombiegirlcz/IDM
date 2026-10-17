package com.revolut.retail.feature.impl.budget.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rqj.h;
import rqj.j;
import rqj.k;
import sqj.a;

/* JADX INFO: loaded from: classes11.dex */
public final class BudgetHistoryDatabase_Impl extends BudgetHistoryDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f101498j = 0;
    public volatile j f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "budget_history_snapshot");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "budget_history_snapshot");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new k(this);
    }

    @Override // com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase
    public final h g() {
        j jVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new j(this);
                }
                jVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
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
        map.put(h.class, Arrays.asList(a.class));
        return map;
    }
}
