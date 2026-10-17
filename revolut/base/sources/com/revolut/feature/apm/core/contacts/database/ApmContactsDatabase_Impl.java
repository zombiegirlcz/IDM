package com.revolut.feature.apm.core.contacts.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx1.b;
import rx1.c;
import rx1.d;
import rx1.e;
import rx1.j;
import rx1.k;
import rx1.l;
import rx1.m;
import rx1.n;
import sx1.a;
import sx1.g;
import tx1.i;
import vx1.f;
import zx1.h;

/* JADX INFO: loaded from: classes.dex */
public final class ApmContactsDatabase_Impl extends ApmContactsDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f61842s = 0;
    public volatile g f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile i f61843j;
    public volatile ux1.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile f f61844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile xx1.f f61845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile h f61846n;
    public volatile ay1.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile by1.g f61847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile cy1.g f61848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile dy1.g f61849r;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "aani_contacts", "bizum_contacts", "blik_contacts_temp", "breb_contacts", "iris_contacts", "multibanco_contacts", "pix_contacts", "qvik_contacts", "spin_contacts", "wero_contacts");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "aani_contacts", "bizum_contacts", "blik_contacts_temp", "breb_contacts", "iris_contacts", "multibanco_contacts", "pix_contacts", "qvik_contacts", "spin_contacts", "wero_contacts");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new n(this);
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final a g() {
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

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rx1.h());
        arrayList.add(new rx1.i());
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new rx1.f());
        arrayList.add(new rx1.g());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        g.k();
        List list = Collections.EMPTY_LIST;
        map.put(a.class, list);
        i.m();
        map.put(tx1.a.class, list);
        ux1.g.k();
        map.put(ux1.a.class, list);
        f.k();
        map.put(vx1.a.class, list);
        xx1.f.l();
        map.put(xx1.a.class, list);
        h.k();
        map.put(zx1.a.class, list);
        ay1.h.k();
        map.put(ay1.a.class, list);
        by1.g.k();
        map.put(by1.a.class, list);
        cy1.g.k();
        map.put(cy1.a.class, list);
        dy1.g.k();
        map.put(dy1.a.class, list);
        return map;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final tx1.a h() {
        i iVar;
        if (this.f61843j != null) {
            return this.f61843j;
        }
        synchronized (this) {
            try {
                if (this.f61843j == null) {
                    this.f61843j = new i(this);
                }
                iVar = this.f61843j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return iVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final ux1.a i() {
        ux1.g gVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new ux1.g(this);
                }
                gVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final vx1.a j() {
        f fVar;
        if (this.f61844l != null) {
            return this.f61844l;
        }
        synchronized (this) {
            try {
                if (this.f61844l == null) {
                    this.f61844l = new f(this);
                }
                fVar = this.f61844l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final xx1.a k() {
        xx1.f fVar;
        if (this.f61845m != null) {
            return this.f61845m;
        }
        synchronized (this) {
            try {
                if (this.f61845m == null) {
                    this.f61845m = new xx1.f(this);
                }
                fVar = this.f61845m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final zx1.a l() {
        h hVar;
        if (this.f61846n != null) {
            return this.f61846n;
        }
        synchronized (this) {
            try {
                if (this.f61846n == null) {
                    this.f61846n = new h(this);
                }
                hVar = this.f61846n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final ay1.a m() {
        ay1.h hVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new ay1.h(this);
                }
                hVar = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final by1.a n() {
        by1.g gVar;
        if (this.f61847p != null) {
            return this.f61847p;
        }
        synchronized (this) {
            try {
                if (this.f61847p == null) {
                    this.f61847p = new by1.g(this);
                }
                gVar = this.f61847p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final cy1.a o() {
        cy1.g gVar;
        if (this.f61848q != null) {
            return this.f61848q;
        }
        synchronized (this) {
            try {
                if (this.f61848q == null) {
                    this.f61848q = new cy1.g(this);
                }
                gVar = this.f61848q;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase
    public final dy1.a p() {
        dy1.g gVar;
        if (this.f61849r != null) {
            return this.f61849r;
        }
        synchronized (this) {
            try {
                if (this.f61849r == null) {
                    this.f61849r = new dy1.g(this);
                }
                gVar = this.f61849r;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }
}
