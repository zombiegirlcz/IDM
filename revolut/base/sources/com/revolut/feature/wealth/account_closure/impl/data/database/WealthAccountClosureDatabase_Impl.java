package com.revolut.feature.wealth.account_closure.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ptg.a;
import qtg.b;
import qtg.c;
import qtg.e;

/* JADX INFO: loaded from: classes9.dex */
public final class WealthAccountClosureDatabase_Impl extends WealthAccountClosureDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile b f94895j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "account_closure_backend_requested", "account_closure_progress");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "account_closure_backend_requested", "account_closure_progress");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase
    public final qtg.a g() {
        b bVar;
        if (this.f94895j != null) {
            return this.f94895j;
        }
        synchronized (this) {
            try {
                if (this.f94895j == null) {
                    this.f94895j = new b(this);
                }
                bVar = this.f94895j;
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
        map.put(c.class, list);
        map.put(qtg.a.class, list);
        return map;
    }

    @Override // com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase
    public final c h() {
        e eVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new e(this);
                }
                eVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }
}
