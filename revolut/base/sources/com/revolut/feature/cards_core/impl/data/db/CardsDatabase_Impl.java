package com.revolut.feature.cards_core.impl.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s93.c;
import s93.e;
import t93.a;

/* JADX INFO: loaded from: classes21.dex */
public final class CardsDatabase_Impl extends CardsDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f65575j = 0;
    public volatile e f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "revolut_card_sca_counters");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "revolut_card_sca_counters");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.cards_core.impl.data.db.CardsDatabase
    public final c g() {
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
        map.put(c.class, Collections.EMPTY_LIST);
        return map;
    }
}
