package com.revolut.feature.push_to_card.impl.storage.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qra.a;
import qra.d;
import qra.e;
import qra.f;
import qra.h;

/* JADX INFO: loaded from: classes13.dex */
public final class PushToCardDatabase_Impl extends PushToCardDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile d f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile h f81587j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "card_owners", "card_owners_stats");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "card_owners", "card_owners_stats");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new e(this);
    }

    @Override // com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase
    public final a g() {
        d dVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new d(this);
                }
                dVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
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
        map.put(a.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase
    public final f h() {
        h hVar;
        if (this.f81587j != null) {
            return this.f81587j;
        }
        synchronized (this) {
            try {
                if (this.f81587j == null) {
                    this.f81587j = new h(this);
                }
                hVar = this.f81587j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }
}
