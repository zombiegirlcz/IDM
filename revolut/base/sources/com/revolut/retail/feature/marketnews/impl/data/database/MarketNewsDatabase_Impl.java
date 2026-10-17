package com.revolut.retail.feature.marketnews.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xzj.a;
import zzj.b;
import zzj.d;
import zzj.f;
import zzj.j;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketNewsDatabase_Impl extends MarketNewsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile d f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile j f101823j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "scoped_symbols", "wealth_news");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "scoped_symbols", "wealth_news");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase
    public final b g() {
        d dVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new d(this);
                }
                dVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
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
        map.put(f.class, list);
        return map;
    }

    @Override // com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase
    public final f h() {
        j jVar;
        if (this.f101823j != null) {
            return this.f101823j;
        }
        synchronized (this) {
            try {
                if (this.f101823j == null) {
                    this.f101823j = new j(this);
                }
                jVar = this.f101823j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }
}
