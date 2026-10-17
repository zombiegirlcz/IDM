package ip0;

import com.revolut.core.ui_kit.delegates.ProductValuePropCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z20 implements koi.j, qv0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f167387c;
    public final UrlMedia d;
    public final y20 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167389h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167390j;

    public z20(String listId, TextClause textClause, TextClause textClause2, UrlMedia media, y20 layout, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f167385a = listId;
        this.f167386b = textClause;
        this.f167387c = textClause2;
        this.d = media;
        this.e = layout;
        this.f = z;
        this.f167388g = null;
        this.f167389h = null;
        this.i = null;
        this.f167390j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProductValuePropCardDelegate(0);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55132b() {
        return this.f167385a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj2;
        return Intrinsics.f(this.f167385a, z20Var.f167385a) && Intrinsics.f(this.f167386b, z20Var.f167386b) && Intrinsics.f(this.f167387c, z20Var.f167387c) && this.d.equals(z20Var.d) && this.e == z20Var.e && this.f == z20Var.f && Intrinsics.f(this.f167388g, z20Var.f167388g) && Intrinsics.f(this.f167389h, z20Var.f167389h) && Intrinsics.f(this.i, z20Var.i) && Intrinsics.f(this.f167390j, z20Var.f167390j);
    }

    public final int hashCode() {
        int iHashCode = this.f167385a.hashCode() * 31;
        Clause clause = this.f167386b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f167387c;
        int iC = j6.a.c((this.e.hashCode() + p.a.c((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d.f60075a)) * 31, 31, this.f);
        p31.c cVar = this.f167388g;
        int iHashCode3 = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167389h;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167390j;
        return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f167390j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.f167388g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167389h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f167389h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167390j = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167388g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof z20 ? (z20) oldItem : null) == null) {
            return null;
        }
        z20 z20Var = (z20) oldItem;
        return new a30(!Intrinsics.f(z20Var.f167386b, this.f167386b), !Intrinsics.f(z20Var.f167387c, this.f167387c), !z20Var.d.equals(this.d), z20Var.e != this.e, z20Var.f != this.f);
    }
}
