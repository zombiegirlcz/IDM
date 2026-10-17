package com.revolut.shared.feature.payments.money_request.domain.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y8l.c;
import y8l.d;
import y8l.e;
import y8l.f;
import y8l.g;
import y8l.l;
import y8l.o;

/* JADX INFO: loaded from: classes12.dex */
public final class MoneyRequestDatabase_Impl extends MoneyRequestDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f104881j = 0;
    public volatile o f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "money_requests");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "money_requests");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new g(this);
    }

    @Override // com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestDatabase
    public final l g() {
        o oVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new o(this);
                }
                oVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return oVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(l.class, Collections.EMPTY_LIST);
        return map;
    }
}
