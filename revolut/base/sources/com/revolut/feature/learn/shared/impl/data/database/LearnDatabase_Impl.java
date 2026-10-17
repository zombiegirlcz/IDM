package com.revolut.feature.learn.shared.impl.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import hz8.a;
import hz8.b;
import hz8.h;
import hz8.k;
import hz8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class LearnDatabase_Impl extends LearnDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f77974m = 0;
    public volatile h f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile k f77975j;
    public volatile l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile b f77976l;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "courses", "lessons", "glossary_terms", "blogs", "course_categories", "course_category_join", "total_earned_reward");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "courses", "lessons", "glossary_terms", "blogs", "course_categories", "course_category_join", "total_earned_reward");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new fz8.b(this);
    }

    @Override // com.revolut.feature.learn.shared.impl.data.database.LearnDatabase
    public final a g() {
        b bVar;
        if (this.f77976l != null) {
            return this.f77976l;
        }
        synchronized (this) {
            try {
                if (this.f77976l == null) {
                    this.f77976l = new b(this);
                }
                bVar = this.f77976l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fz8.a());
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
        map.put(h.class, list);
        map.put(k.class, list);
        map.put(l.class, list);
        map.put(a.class, list);
        return map;
    }

    @Override // com.revolut.feature.learn.shared.impl.data.database.LearnDatabase
    public final h h() {
        h hVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new h(this);
                }
                hVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return hVar;
    }

    @Override // com.revolut.feature.learn.shared.impl.data.database.LearnDatabase
    public final k i() {
        k kVar;
        if (this.f77975j != null) {
            return this.f77975j;
        }
        synchronized (this) {
            try {
                if (this.f77975j == null) {
                    this.f77975j = new k(this);
                }
                kVar = this.f77975j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return kVar;
    }

    @Override // com.revolut.feature.learn.shared.impl.data.database.LearnDatabase
    public final l j() {
        l lVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new l(this);
                }
                lVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return lVar;
    }
}
