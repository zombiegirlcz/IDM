package com.revolut.feature.credit.post_termination_plan.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import la5.a;

/* JADX INFO: loaded from: classes21.dex */
public final class PostTerminationPlanDatabase_Impl extends PostTerminationPlanDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f70665j = 0;
    public volatile a f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "post_termination_plan");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "post_termination_plan");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new ka5.a(this);
    }

    @Override // com.revolut.feature.credit.post_termination_plan.impl.database.PostTerminationPlanDatabase
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
