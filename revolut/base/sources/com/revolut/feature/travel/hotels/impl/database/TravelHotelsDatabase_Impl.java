package com.revolut.feature.travel.hotels.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y8g.a;
import z8g.b;
import z8g.d;
import z8g.f;
import z8g.g;
import z8g.j;
import z8g.l;
import z8g.n;
import z8g.p;
import z8g.r;
import z8g.s;
import z8g.u;

/* JADX INFO: loaded from: classes9.dex */
public final class TravelHotelsDatabase_Impl extends TravelHotelsDatabase {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f93636t = 0;
    public volatile l f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile b f93637j;
    public volatile r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile s f93638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile u f93639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile d f93640n;
    public volatile f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile p f93641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile j f93642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile g f93643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile n f93644s;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "hotels_location", "hotels_booking_details", "hotels_recent_location_searches", "hotels_recent_property_searches", "hotels_recent_smart_searches", "hotels_campaign", "hotels_dropoff", "hotels_property_type_category", "hotels_inventory_provider", "hotels_experiences", "hotels_promotions");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "hotels_location", "hotels_booking_details", "hotels_recent_location_searches", "hotels_recent_property_searches", "hotels_recent_smart_searches", "hotels_campaign", "hotels_dropoff", "hotels_property_type_category", "hotels_inventory_provider", "hotels_experiences", "hotels_promotions");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final b g() {
        b bVar;
        if (this.f93637j != null) {
            return this.f93637j;
        }
        synchronized (this) {
            try {
                if (this.f93637j == null) {
                    this.f93637j = new b(this);
                }
                bVar = this.f93637j;
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
        map.put(l.class, list);
        map.put(b.class, list);
        map.put(r.class, list);
        map.put(s.class, list);
        map.put(u.class, list);
        map.put(d.class, list);
        map.put(f.class, list);
        map.put(p.class, list);
        map.put(j.class, list);
        map.put(g.class, list);
        map.put(n.class, list);
        return map;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final d h() {
        d dVar;
        if (this.f93640n != null) {
            return this.f93640n;
        }
        synchronized (this) {
            try {
                if (this.f93640n == null) {
                    this.f93640n = new d(this);
                }
                dVar = this.f93640n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final f i() {
        f fVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new f(this);
                }
                fVar = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final g j() {
        g gVar;
        if (this.f93643r != null) {
            return this.f93643r;
        }
        synchronized (this) {
            try {
                if (this.f93643r == null) {
                    this.f93643r = new g(this);
                }
                gVar = this.f93643r;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final j k() {
        j jVar;
        if (this.f93642q != null) {
            return this.f93642q;
        }
        synchronized (this) {
            try {
                if (this.f93642q == null) {
                    this.f93642q = new j(this);
                }
                jVar = this.f93642q;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final l l() {
        l lVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new l(this);
                }
                lVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final n m() {
        n nVar;
        if (this.f93644s != null) {
            return this.f93644s;
        }
        synchronized (this) {
            try {
                if (this.f93644s == null) {
                    this.f93644s = new n(this);
                }
                nVar = this.f93644s;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return nVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final p n() {
        p pVar;
        if (this.f93641p != null) {
            return this.f93641p;
        }
        synchronized (this) {
            try {
                if (this.f93641p == null) {
                    this.f93641p = new p(this);
                }
                pVar = this.f93641p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return pVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final r o() {
        r rVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new r(this);
                }
                rVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return rVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final s p() {
        s sVar;
        if (this.f93638l != null) {
            return this.f93638l;
        }
        synchronized (this) {
            try {
                if (this.f93638l == null) {
                    this.f93638l = new s(this);
                }
                sVar = this.f93638l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return sVar;
    }

    @Override // com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase
    public final u q() {
        u uVar;
        if (this.f93639m != null) {
            return this.f93639m;
        }
        synchronized (this) {
            try {
                if (this.f93639m == null) {
                    this.f93639m = new u(this);
                }
                uVar = this.f93639m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return uVar;
    }
}
