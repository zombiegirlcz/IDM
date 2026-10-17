package com.revolut.feature.wealth.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import e7h.a;
import f7h.f;
import f7h.g;
import i7h.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class WealthDatabase_Impl extends WealthDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f95479l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile g f95480j;
    public volatile c k;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "collections", "recurring_orders");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "collections", "recurring_orders");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.wealth.impl.data.database.WealthDatabase
    public final f g() {
        g gVar;
        if (this.f95480j != null) {
            return this.f95480j;
        }
        synchronized (this) {
            try {
                if (this.f95480j == null) {
                    this.f95480j = new g(this);
                }
                gVar = this.f95480j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
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
        map.put(i7h.a.class, list);
        return map;
    }

    @Override // com.revolut.feature.wealth.impl.data.database.WealthDatabase
    public final i7h.a h() {
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
}
