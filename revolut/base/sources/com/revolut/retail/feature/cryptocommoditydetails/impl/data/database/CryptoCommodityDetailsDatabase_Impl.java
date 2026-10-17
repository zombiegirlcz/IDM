package com.revolut.retail.feature.cryptocommoditydetails.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wcj.a;
import wcj.b;

/* JADX INFO: loaded from: classes11.dex */
public final class CryptoCommodityDetailsDatabase_Impl extends CryptoCommodityDetailsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile b f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a f100146j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "crypto_details_about", "commodity_price_targets_info");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "crypto_details_about", "commodity_price_targets_info");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new vcj.a(this);
    }

    @Override // com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.CryptoCommodityDetailsDatabase
    public final a g() {
        a aVar;
        if (this.f100146j != null) {
            return this.f100146j;
        }
        synchronized (this) {
            try {
                if (this.f100146j == null) {
                    this.f100146j = new a(this);
                }
                aVar = this.f100146j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
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
        map.put(a.class, list);
        return map;
    }

    @Override // com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.CryptoCommodityDetailsDatabase
    public final b h() {
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
}
