package com.revolut.feature.rewards.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mgc.a;
import pgc.c;
import pgc.d;
import pgc.f;
import pgc.g;
import pgc.j;

/* JADX INFO: loaded from: classes6.dex */
public final class RewardsDatabase_Impl extends RewardsDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f84903l = 0;
    public volatile j f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile f f84904j;
    public volatile c k;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "rewards_short", "rewards_details", "rewards_collections", "rewards_categories");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rewards_short", "rewards_details", "rewards_collections", "rewards_categories");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.rewards.impl.data.database.RewardsDatabase
    public final pgc.a g() {
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
        map.put(g.class, list);
        map.put(d.class, list);
        map.put(pgc.a.class, list);
        return map;
    }

    @Override // com.revolut.feature.rewards.impl.data.database.RewardsDatabase
    public final d h() {
        f fVar;
        if (this.f84904j != null) {
            return this.f84904j;
        }
        synchronized (this) {
            try {
                if (this.f84904j == null) {
                    this.f84904j = new f(this);
                }
                fVar = this.f84904j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.feature.rewards.impl.data.database.RewardsDatabase
    public final g i() {
        j jVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new j(this);
                }
                jVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVar;
    }
}
