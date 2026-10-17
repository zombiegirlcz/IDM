package com.revolut.feature.trading.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import j3f.b;
import j3f.c;
import j3f.e;
import j3f.f;
import j3f.h;
import j3f.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3f.a;

/* JADX INFO: loaded from: classes13.dex */
public final class TradingDatabase_Impl extends TradingDatabase {
    public static final /* synthetic */ int o = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile b f91210j;
    public volatile h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile a f91211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile k3f.b f91212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile i f91213n;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "holdings", "portfolios", "trading_trades", "reports", "us_reports", "entities_adt");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "holdings", "portfolios", "trading_trades", "reports", "us_reports", "entities_adt");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new i3f.a(this);
    }

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final j3f.a g() {
        b bVar;
        if (this.f91210j != null) {
            return this.f91210j;
        }
        synchronized (this) {
            try {
                if (this.f91210j == null) {
                    this.f91210j = new b(this);
                }
                bVar = this.f91210j;
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
        e.b();
        List list = Collections.EMPTY_LIST;
        map.put(c.class, list);
        b.b();
        map.put(j3f.a.class, list);
        map.put(f.class, list);
        map.put(a.class, list);
        map.put(k3f.b.class, list);
        i.a();
        map.put(i.class, list);
        return map;
    }

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final c h() {
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

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final a i() {
        a aVar;
        if (this.f91211l != null) {
            return this.f91211l;
        }
        synchronized (this) {
            try {
                if (this.f91211l == null) {
                    this.f91211l = new a(this);
                }
                aVar = this.f91211l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
    }

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final f j() {
        h hVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new h(this);
                }
                hVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final i k() {
        i iVar;
        if (this.f91213n != null) {
            return this.f91213n;
        }
        synchronized (this) {
            try {
                if (this.f91213n == null) {
                    this.f91213n = new i(this);
                }
                iVar = this.f91213n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return iVar;
    }

    @Override // com.revolut.feature.trading.impl.data.database.TradingDatabase
    public final k3f.b l() {
        k3f.b bVar;
        if (this.f91212m != null) {
            return this.f91212m;
        }
        synchronized (this) {
            try {
                if (this.f91212m == null) {
                    this.f91212m = new k3f.b(this);
                }
                bVar = this.f91212m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
    }
}
