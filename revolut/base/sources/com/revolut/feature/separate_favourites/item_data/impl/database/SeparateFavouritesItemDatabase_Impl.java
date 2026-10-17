package com.revolut.feature.separate_favourites.item_data.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import b4d.b;
import b4d.d;
import h4d.a;
import h4d.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4d.n;
import n4d.q;
import n4d.s;
import n4d.x;

/* JADX INFO: loaded from: classes13.dex */
public final class SeparateFavouritesItemDatabase_Impl extends SeparateFavouritesItemDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f86022m = 0;
    public volatile x f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile q f86023j;
    public volatile c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile d f86024l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "plain_watchlist_items", "plain_multiple_watchlists_items", "converter_items", "alert_items", "watchlists");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "plain_watchlist_items", "plain_multiple_watchlists_items", "converter_items", "alert_items", "watchlists");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new k4d.c(this);
    }

    @Override // com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase
    public final b g() {
        d dVar;
        if (this.f86024l != null) {
            return this.f86024l;
        }
        synchronized (this) {
            try {
                if (this.f86024l == null) {
                    this.f86024l = new d(this);
                }
                dVar = this.f86024l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k4d.b());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        x.r();
        List list = Collections.EMPTY_LIST;
        map.put(s.class, list);
        map.put(n.class, list);
        map.put(a.class, list);
        map.put(b.class, list);
        return map;
    }

    @Override // com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase
    public final a h() {
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

    @Override // com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase
    public final n i() {
        q qVar;
        if (this.f86023j != null) {
            return this.f86023j;
        }
        synchronized (this) {
            try {
                if (this.f86023j == null) {
                    this.f86023j = new q(this);
                }
                qVar = this.f86023j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return qVar;
    }

    @Override // com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase
    public final s j() {
        x xVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new x(this);
                }
                xVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return xVar;
    }
}
