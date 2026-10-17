package com.revolut.feature.payments.splitbill.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y0a.a;
import y0a.b;

/* JADX INFO: loaded from: classes5.dex */
public final class SplitBillDatabase_Impl extends SplitBillDatabase {
    public static final /* synthetic */ int f = 0;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "split_bill");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "split_bill");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new b(this);
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
