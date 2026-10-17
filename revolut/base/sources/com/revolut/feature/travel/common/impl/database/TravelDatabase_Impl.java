package com.revolut.feature.travel.common.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uxf.a;
import wxf.c;
import wxf.d;
import wxf.e;
import wxf.f;
import wxf.h;
import wxf.j;

/* JADX INFO: loaded from: classes9.dex */
public final class TravelDatabase_Impl extends TravelDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f92742m = 0;
    public volatile c f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile h f92743j;
    public volatile j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile e f92744l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "travel_booking", "travel_favorite", "travel_trip", "travel_trip_destination", "travel_document");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "travel_booking", "travel_favorite", "travel_trip", "travel_trip_destination", "travel_document");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.travel.common.impl.database.TravelDatabase
    public final wxf.a g() {
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
        map.put(wxf.a.class, list);
        map.put(f.class, list);
        map.put(j.class, list);
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.feature.travel.common.impl.database.TravelDatabase
    public final d h() {
        e eVar;
        if (this.f92744l != null) {
            return this.f92744l;
        }
        synchronized (this) {
            try {
                if (this.f92744l == null) {
                    this.f92744l = new e(this);
                }
                eVar = this.f92744l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }

    @Override // com.revolut.feature.travel.common.impl.database.TravelDatabase
    public final f i() {
        h hVar;
        if (this.f92743j != null) {
            return this.f92743j;
        }
        synchronized (this) {
            try {
                if (this.f92743j == null) {
                    this.f92743j = new h(this);
                }
                hVar = this.f92743j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.travel.common.impl.database.TravelDatabase
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
