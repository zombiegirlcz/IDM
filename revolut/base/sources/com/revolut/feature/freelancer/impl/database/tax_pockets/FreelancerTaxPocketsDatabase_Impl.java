package com.revolut.feature.freelancer.impl.database.tax_pockets;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ms6.a;
import os6.b;
import os6.d;
import os6.e;
import os6.f;

/* JADX INFO: loaded from: classes3.dex */
public final class FreelancerTaxPocketsDatabase_Impl extends FreelancerTaxPocketsDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f73515m = 0;
    public volatile b f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f73516j;
    public volatile e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile f f73517l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "tax_hub_calendar_event", "tax_hub_tax_profile", "vat_reminder", "vat_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "tax_hub_calendar_event", "tax_hub_tax_profile", "vat_reminder", "vat_summary");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new ms6.b(this);
    }

    @Override // com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase
    public final b g() {
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

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
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
        map.put(b.class, list);
        map.put(d.class, list);
        map.put(e.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase
    public final d h() {
        d dVar;
        if (this.f73516j != null) {
            return this.f73516j;
        }
        synchronized (this) {
            try {
                if (this.f73516j == null) {
                    this.f73516j = new d(this);
                }
                dVar = this.f73516j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase
    public final e i() {
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

    @Override // com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase
    public final f j() {
        f fVar;
        if (this.f73517l != null) {
            return this.f73517l;
        }
        synchronized (this) {
            try {
                if (this.f73517l == null) {
                    this.f73517l = new f(this);
                }
                fVar = this.f73517l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }
}
