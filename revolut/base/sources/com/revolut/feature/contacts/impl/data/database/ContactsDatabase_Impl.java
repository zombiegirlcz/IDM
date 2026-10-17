package com.revolut.feature.contacts.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ml3.a;
import ml3.h;
import ml3.j;
import ml3.k;
import ml3.l;
import ml3.m;
import ml3.n;
import ml3.q;
import ml3.r;
import ml3.s;
import ml3.t;
import ml3.x;
import ml3.z;

/* JADX INFO: loaded from: classes13.dex */
public final class ContactsDatabase_Impl extends ContactsDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f65996m = 0;
    public volatile h f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile r f65997j;
    public volatile z k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile t f65998l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "contact", "remote_contacts", "virtual_contacts", "remote_contacts_extra");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "contact", "remote_contacts", "virtual_contacts", "remote_contacts_extra");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new n(this);
    }

    @Override // com.revolut.feature.contacts.impl.data.database.ContactsDatabase
    public final a g() {
        h hVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new h(this);
                }
                hVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new j());
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
        map.put(a.class, list);
        map.put(q.class, list);
        map.put(x.class, list);
        map.put(s.class, list);
        return map;
    }

    @Override // com.revolut.feature.contacts.impl.data.database.ContactsDatabase
    public final q h() {
        r rVar;
        if (this.f65997j != null) {
            return this.f65997j;
        }
        synchronized (this) {
            try {
                if (this.f65997j == null) {
                    this.f65997j = new r(this);
                }
                rVar = this.f65997j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return rVar;
    }

    @Override // com.revolut.feature.contacts.impl.data.database.ContactsDatabase
    public final s i() {
        t tVar;
        if (this.f65998l != null) {
            return this.f65998l;
        }
        synchronized (this) {
            try {
                if (this.f65998l == null) {
                    this.f65998l = new t(this);
                }
                tVar = this.f65998l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return tVar;
    }

    @Override // com.revolut.feature.contacts.impl.data.database.ContactsDatabase
    public final x j() {
        z zVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new z(this);
                }
                zVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zVar;
    }
}
