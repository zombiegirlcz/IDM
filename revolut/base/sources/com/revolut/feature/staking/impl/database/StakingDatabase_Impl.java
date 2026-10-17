package com.revolut.feature.staking.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jud.a;
import jud.b;
import jud.e;
import jud.f;
import jud.g;
import jud.h;
import jud.i;

/* JADX INFO: loaded from: classes7.dex */
public final class StakingDatabase_Impl extends StakingDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f88123l = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile g f88124j;
    public volatile i k;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "staking_pockets", "staking_rewards", "unstaking_data");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "staking_pockets", "staking_rewards", "unstaking_data");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.staking.impl.database.StakingDatabase
    public final b g() {
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
        map.put(b.class, list);
        map.put(f.class, list);
        map.put(h.class, list);
        return map;
    }

    @Override // com.revolut.feature.staking.impl.database.StakingDatabase
    public final f h() {
        g gVar;
        if (this.f88124j != null) {
            return this.f88124j;
        }
        synchronized (this) {
            try {
                if (this.f88124j == null) {
                    this.f88124j = new g(this);
                }
                gVar = this.f88124j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    @Override // com.revolut.feature.staking.impl.database.StakingDatabase
    public final h i() {
        i iVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new i(this);
                }
                iVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return iVar;
    }
}
