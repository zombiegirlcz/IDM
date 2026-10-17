package com.revolut.feature.invest.smart_notifications.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import b18.a;
import c18.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class SmartNotificationsDatabase_Impl extends SmartNotificationsDatabase {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile f f76426j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "smart_notification_feed", "feed_asset_types");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "smart_notification_feed", "feed_asset_types");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
    }

    @Override // com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase
    public final c18.a g() {
        f fVar;
        if (this.f76426j != null) {
            return this.f76426j;
        }
        synchronized (this) {
            try {
                if (this.f76426j == null) {
                    this.f76426j = new f(this);
                }
                fVar = this.f76426j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
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
        map.put(c18.a.class, Collections.EMPTY_LIST);
        return map;
    }
}
