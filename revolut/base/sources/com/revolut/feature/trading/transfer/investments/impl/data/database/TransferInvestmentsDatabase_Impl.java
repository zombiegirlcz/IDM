package com.revolut.feature.trading.transfer.investments.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w8f.b;
import x8f.a;
import x8f.c;

/* JADX INFO: loaded from: classes8.dex */
public final class TransferInvestmentsDatabase_Impl extends TransferInvestmentsDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f91551j = 0;
    public volatile c f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "transfer_instruments");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "transfer_instruments");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b(this);
    }

    @Override // com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase
    public final a g() {
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w8f.a());
        return arrayList;
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
