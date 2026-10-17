package com.revolut.feature.junior_transfer_request.impl.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nr8.a;
import pr8.c;

/* JADX INFO: loaded from: classes4.dex */
public final class JuniorTransferRequestDatabase_Impl extends JuniorTransferRequestDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f77458j = 0;
    public volatile c f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "junior_transfer_request");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "junior_transfer_request");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase
    public final pr8.a g() {
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
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(pr8.a.class, Collections.EMPTY_LIST);
        return map;
    }
}
