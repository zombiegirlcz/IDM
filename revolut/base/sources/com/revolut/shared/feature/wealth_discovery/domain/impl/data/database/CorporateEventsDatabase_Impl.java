package com.revolut.shared.feature.wealth_discovery.domain.impl.data.database;

import ahl.b;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import bhl.a;
import bhl.c;
import bhl.f;
import bhl.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class CorporateEventsDatabase_Impl extends CorporateEventsDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f105367l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile i f105368j;
    public volatile c k;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "upcoming_events", "calendar_events");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "upcoming_events", "calendar_events");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b(this);
    }

    @Override // com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase
    public final a g() {
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
        map.put(f.class, list);
        map.put(a.class, list);
        return map;
    }

    @Override // com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase
    public final f h() {
        i iVar;
        if (this.f105368j != null) {
            return this.f105368j;
        }
        synchronized (this) {
            try {
                if (this.f105368j == null) {
                    this.f105368j = new i(this);
                }
                iVar = this.f105368j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return iVar;
    }
}
