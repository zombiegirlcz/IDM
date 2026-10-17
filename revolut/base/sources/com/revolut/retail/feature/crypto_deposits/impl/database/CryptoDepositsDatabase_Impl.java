package com.revolut.retail.feature.crypto_deposits.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lbj.f;
import lbj.g;
import lbj.h;
import lbj.i;
import lbj.j;
import nbj.a;

/* JADX INFO: loaded from: classes11.dex */
public final class CryptoDepositsDatabase_Impl extends CryptoDepositsDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f100051j = 0;
    public volatile a f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "crypto_action_required_deposits");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "crypto_action_required_deposits");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new j(this);
    }

    @Override // com.revolut.retail.feature.crypto_deposits.impl.database.CryptoDepositsDatabase
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
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
