package com.revolut.sso.impl.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rjl.a;
import tjl.b;
import tjl.d;

/* JADX INFO: loaded from: classes12.dex */
public final class SsoDatabase_Impl extends SsoDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile b f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile d f106027j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "consented_client", "user_info_account");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "consented_client", "user_info_account");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.sso.impl.data.db.SsoDatabase
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
        map.put(d.class, list);
        return map;
    }

    @Override // com.revolut.sso.impl.data.db.SsoDatabase
    public final d h() {
        d dVar;
        if (this.f106027j != null) {
            return this.f106027j;
        }
        synchronized (this) {
            try {
                if (this.f106027j == null) {
                    this.f106027j = new d(this);
                }
                dVar = this.f106027j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }
}
