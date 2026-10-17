package com.revolut.feature.trade_rev_points.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1f.a;
import n1f.b;
import n1f.d;

/* JADX INFO: loaded from: classes8.dex */
public final class TradeRevPointsDatabase_Impl extends TradeRevPointsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile b f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f91110j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "trade_rev_points_accounts", "trade_rev_points_agents");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "trade_rev_points_accounts", "trade_rev_points_agents");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.trade_rev_points.impl.database.TradeRevPointsDatabase
    public final b g() {
        b bVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new b(this);
                }
                bVar = this.f;
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
        map.put(b.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.feature.trade_rev_points.impl.database.TradeRevPointsDatabase
    public final d h() {
        d dVar;
        if (this.f91110j != null) {
            return this.f91110j;
        }
        synchronized (this) {
            try {
                if (this.f91110j == null) {
                    this.f91110j = new d(this);
                }
                dVar = this.f91110j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }
}
