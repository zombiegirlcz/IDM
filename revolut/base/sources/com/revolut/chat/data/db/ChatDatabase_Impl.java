package com.revolut.chat.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kdh.b;
import ofg.i;
import r10.d;
import r10.e;
import r10.f;
import r10.g;
import r10.q;
import r10.r;
import r10.t;
import r10.v;
import r10.w;

/* JADX INFO: loaded from: classes19.dex */
public final class ChatDatabase_Impl extends ChatDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f50986r = 0;
    public volatile d f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile r10.a f50987j;
    public volatile q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile r f50988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile t f50989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile w f50990n;
    public volatile f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile b f50991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile v f50992q;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "chats", "agents", "messages", "uploads", "feeds", "pending_uploads", "chat_drafts", "chat_history_load_state", "message_search", "message_search_meta");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "chats", "agents", "messages", "uploads", "feeds", "pending_uploads", "chat_drafts", "chat_history_load_state", "message_search", "message_search_meta");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new e(this);
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final r10.a g() {
        r10.a aVar;
        if (this.f50987j != null) {
            return this.f50987j;
        }
        synchronized (this) {
            try {
                if (this.f50987j == null) {
                    r10.a aVar2 = new r10.a();
                    aVar2.f250811a = this;
                    aVar2.f250812b = new i(aVar2, 13);
                    this.f50987j = aVar2;
                }
                aVar = this.f50987j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
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
        map.put(d.class, list);
        map.put(r10.a.class, list);
        map.put(q.class, list);
        map.put(r.class, list);
        map.put(t.class, list);
        map.put(w.class, list);
        map.put(f.class, list);
        map.put(g.class, list);
        map.put(v.class, list);
        return map;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final d h() {
        d dVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    d dVar2 = new d();
                    dVar2.f250818a = this;
                    dVar2.f250819b = new i(dVar2, 14);
                    this.f = dVar2;
                }
                dVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return dVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final f i() {
        f fVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new f(this);
                }
                fVar = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return fVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final g j() {
        b bVar;
        if (this.f50991p != null) {
            return this.f50991p;
        }
        synchronized (this) {
            try {
                if (this.f50991p == null) {
                    this.f50991p = new b(this);
                }
                bVar = this.f50991p;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return bVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final t k() {
        t tVar;
        if (this.f50989m != null) {
            return this.f50989m;
        }
        synchronized (this) {
            try {
                if (this.f50989m == null) {
                    this.f50989m = new t(this);
                }
                tVar = this.f50989m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return tVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final v l() {
        v vVar;
        if (this.f50992q != null) {
            return this.f50992q;
        }
        synchronized (this) {
            try {
                if (this.f50992q == null) {
                    this.f50992q = new v(this);
                }
                vVar = this.f50992q;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return vVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final q m() {
        q qVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new q(this);
                }
                qVar = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return qVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final w n() {
        w wVar;
        if (this.f50990n != null) {
            return this.f50990n;
        }
        synchronized (this) {
            try {
                if (this.f50990n == null) {
                    w wVar2 = new w();
                    wVar2.f250865a = this;
                    wVar2.f250866b = new i(wVar2, 22);
                    this.f50990n = wVar2;
                }
                wVar = this.f50990n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return wVar;
    }

    @Override // com.revolut.chat.data.db.ChatDatabase
    public final r o() {
        r rVar;
        if (this.f50988l != null) {
            return this.f50988l;
        }
        synchronized (this) {
            try {
                if (this.f50988l == null) {
                    r rVar2 = new r();
                    rVar2.f250853c = new s10.a();
                    rVar2.f250851a = this;
                    rVar2.f250852b = new i(rVar2, 18);
                    this.f50988l = rVar2;
                }
                rVar = this.f50988l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return rVar;
    }
}
