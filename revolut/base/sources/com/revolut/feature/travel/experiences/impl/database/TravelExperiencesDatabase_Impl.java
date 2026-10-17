package com.revolut.feature.travel.experiences.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0g.a;
import t0g.c;
import t0g.e;
import t0g.f;
import t0g.g;

/* JADX INFO: loaded from: classes9.dex */
public final class TravelExperiencesDatabase_Impl extends TravelExperiencesDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f92934m = 0;
    public volatile c f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile f f92935j;
    public volatile e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile g f92936l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "travel_experiences_booking", "travel_experiences_recent_search_destination", "travel_experiences_recently_viewed_dropoff", "travel_experiences_reviews", "travel_experiences_reviews_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "travel_experiences_booking", "travel_experiences_recent_search_destination", "travel_experiences_recently_viewed_dropoff", "travel_experiences_reviews", "travel_experiences_reviews_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase
    public final c g() {
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
        map.put(c.class, list);
        map.put(f.class, list);
        map.put(e.class, list);
        map.put(g.class, list);
        return map;
    }

    @Override // com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase
    public final e h() {
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

    @Override // com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase
    public final f i() {
        f fVar;
        if (this.f92935j != null) {
            return this.f92935j;
        }
        synchronized (this) {
            try {
                if (this.f92935j == null) {
                    this.f92935j = new f(this);
                }
                fVar = this.f92935j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase
    public final g j() {
        g gVar;
        if (this.f92936l != null) {
            return this.f92936l;
        }
        synchronized (this) {
            try {
                if (this.f92936l == null) {
                    this.f92936l = new g(this);
                }
                gVar = this.f92936l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }
}
