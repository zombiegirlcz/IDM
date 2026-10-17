package com.revolut.feature.global_markets.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n77.a;
import n77.b;
import n77.c;
import n77.d;
import n77.e;
import n77.i;
import n77.l;

/* JADX INFO: loaded from: classes13.dex */
public final class GlobalMarketsDatabase_Impl extends GlobalMarketsDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f74579l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile l f74580j;
    public volatile e k;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "market_assets", "index_details");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "market_assets", "index_details");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new c(this);
    }

    @Override // com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase
    public final d g() {
        e eVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new e(this);
                }
                eVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
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
        map.put(i.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase
    public final i h() {
        l lVar;
        if (this.f74580j != null) {
            return this.f74580j;
        }
        synchronized (this) {
            try {
                if (this.f74580j == null) {
                    this.f74580j = new l(this);
                }
                lVar = this.f74580j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }
}
