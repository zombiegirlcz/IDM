package com.revolut.feature.travel.miles.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ofg.b;
import ofg.d;
import ofg.g;
import ofg.j;

/* JADX INFO: loaded from: classes9.dex */
public final class TravelMilesDatabase_Impl extends TravelMilesDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f94162m = 0;
    public volatile g f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f94163j;
    public volatile j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile b f94164l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "travel_miles_provider", "travel_miles_rates", "travel_miles_accounts", "travel_miles_airlines", "travel_miles_topup", "travel_miles_transactions", "travel_miles_airline_details");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "travel_miles_provider", "travel_miles_rates", "travel_miles_accounts", "travel_miles_airlines", "travel_miles_topup", "travel_miles_transactions", "travel_miles_airline_details");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new mfg.b(this);
    }

    @Override // com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase
    public final b g() {
        b bVar;
        if (this.f94164l != null) {
            return this.f94164l;
        }
        synchronized (this) {
            try {
                if (this.f94164l == null) {
                    this.f94164l = new b(this);
                }
                bVar = this.f94164l;
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
        map.put(g.class, list);
        map.put(d.class, list);
        map.put(j.class, list);
        map.put(b.class, list);
        return map;
    }

    @Override // com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase
    public final d h() {
        d dVar;
        if (this.f94163j != null) {
            return this.f94163j;
        }
        synchronized (this) {
            try {
                if (this.f94163j == null) {
                    this.f94163j = new d(this);
                }
                dVar = this.f94163j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase
    public final g i() {
        g gVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new g(this);
                }
                gVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase
    public final j j() {
        j jVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new j(this);
                }
                jVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }
}
