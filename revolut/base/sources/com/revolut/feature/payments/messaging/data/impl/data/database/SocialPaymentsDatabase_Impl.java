package com.revolut.feature.payments.messaging.data.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import fv9.b;
import fv9.d;
import fv9.e;
import gv9.c;
import gv9.j;
import gv9.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class SocialPaymentsDatabase_Impl extends SocialPaymentsDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile j f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile k f79584j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "payments_social_reactions", "payments_message_reactions", "payments_social_sent_message");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "payments_social_reactions", "payments_message_reactions", "payments_social_sent_message");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new e(this);
    }

    @Override // com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase
    public final c g() {
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

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        arrayList.add(new fv9.c());
        arrayList.add(new d());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(c.class, list);
        k.a();
        map.put(k.class, list);
        return map;
    }

    @Override // com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase
    public final k h() {
        k kVar;
        if (this.f79584j != null) {
            return this.f79584j;
        }
        synchronized (this) {
            try {
                if (this.f79584j == null) {
                    this.f79584j = new k(this);
                }
                kVar = this.f79584j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return kVar;
    }
}
