package com.revolut.feature.crypto.withdraw.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qo5.o;
import qo5.p;
import ro5.d;
import to5.a;
import to5.b;
import to5.c;

/* JADX INFO: loaded from: classes13.dex */
public final class CryptoWithdrawDatabase_Impl extends CryptoWithdrawDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f71150j = 0;
    public volatile d f;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "crypto_addresses", "crypto_wallets");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "crypto_addresses", "crypto_wallets");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new p(this);
    }

    @Override // com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase
    public final d g() {
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(d.class, Arrays.asList(to5.d.class, b.class, c.class, a.class));
        return map;
    }
}
