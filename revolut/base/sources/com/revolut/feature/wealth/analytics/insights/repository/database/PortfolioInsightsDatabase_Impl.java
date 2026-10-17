package com.revolut.feature.wealth.analytics.insights.repository.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import twg.b;
import twg.c;
import twg.d;
import twg.e;

/* JADX INFO: loaded from: classes9.dex */
public final class PortfolioInsightsDatabase_Impl extends PortfolioInsightsDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f95018j = 0;
    public volatile c f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "portfolio_insights", "portfolio_insights_asset_indicator", "portfolio_insights_collection_indicator");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "portfolio_insights", "portfolio_insights_asset_indicator", "portfolio_insights_collection_indicator");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new d(this);
    }

    @Override // com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase
    public final c g() {
        c cVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    c cVar2 = new c();
                    cVar2.f275017a = this;
                    cVar2.f275018b = new b(cVar2, 0);
                    cVar2.d = new b(cVar2, 1);
                    new b(cVar2, 2);
                    this.f = cVar2;
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
        map.put(c.class, Arrays.asList(e.class));
        return map;
    }
}
