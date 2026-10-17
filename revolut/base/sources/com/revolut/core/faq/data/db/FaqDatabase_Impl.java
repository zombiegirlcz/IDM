package com.revolut.core.faq.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xf0.a;
import xf0.c;
import xf0.d;
import xf0.e;
import xf0.f;
import xf0.g;
import xf0.i;
import xf0.k;

/* JADX INFO: loaded from: classes.dex */
public final class FaqDatabase_Impl extends FaqDatabase {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f51376n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile c f51377j;
    public volatile i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile k f51378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile f f51379m;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "faq", "settings", "light_faq", "pigeon_tree_node", "pigeon_node_details");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "faq", "settings", "light_faq", "pigeon_tree_node", "pigeon_node_details");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new d(this);
    }

    @Override // com.revolut.core.faq.data.db.FaqDatabase
    public final a g() {
        c cVar;
        if (this.f51377j != null) {
            return this.f51377j;
        }
        synchronized (this) {
            try {
                if (this.f51377j == null) {
                    this.f51377j = new c(this);
                }
                cVar = this.f51377j;
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
        map.put(a.class, list);
        map.put(g.class, list);
        k.a();
        map.put(k.class, list);
        map.put(e.class, list);
        return map;
    }

    @Override // com.revolut.core.faq.data.db.FaqDatabase
    public final e h() {
        f fVar;
        if (this.f51379m != null) {
            return this.f51379m;
        }
        synchronized (this) {
            try {
                if (this.f51379m == null) {
                    this.f51379m = new f(this);
                }
                fVar = this.f51379m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.core.faq.data.db.FaqDatabase
    public final g i() {
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

    @Override // com.revolut.core.faq.data.db.FaqDatabase
    public final k j() {
        k kVar;
        if (this.f51378l != null) {
            return this.f51378l;
        }
        synchronized (this) {
            try {
                if (this.f51378l == null) {
                    this.f51378l = new k(this);
                }
                kVar = this.f51378l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return kVar;
    }
}
