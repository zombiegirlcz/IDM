package com.revolut.feature.defi.accounts.impl.data;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import h16.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class DeFiAccountsDatabase_Impl extends DeFiAccountsDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f71645j = 0;
    public volatile a f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "defi_accounts");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "defi_accounts");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new g16.a(this);
    }

    @Override // com.revolut.feature.defi.accounts.impl.data.DeFiAccountsDatabase
    public final a g() {
        a aVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new a(this);
                }
                aVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
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
        map.put(a.class, Collections.EMPTY_LIST);
        return map;
    }
}
