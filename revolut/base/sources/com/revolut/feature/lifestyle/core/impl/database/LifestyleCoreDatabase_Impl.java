package com.revolut.feature.lifestyle.core.impl.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p29.a;

/* JADX INFO: loaded from: classes4.dex */
public final class LifestyleCoreDatabase_Impl extends LifestyleCoreDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f78061j = 0;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "lifestyle_tab_config", "points_advertisement_earning_rule", "points_miles_redemption_rule", "points_product_earning_rule");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "lifestyle_tab_config", "points_advertisement_earning_rule", "points_miles_redemption_rule", "points_product_earning_rule");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a(this);
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
        return new HashMap();
    }
}
