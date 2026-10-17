package ip0;

import com.revolut.core.ui_kit.delegates.LoginActionFooterDelegate;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yv implements koi.j, qv0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f167358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f167360c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    public yv(Clause text, List items) {
        Intrinsics.checkNotNullParameter("LIST_ID_OTHER_OPTIONS_CONTAINER", "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f167358a = text;
        this.f167359b = items;
        this.f167360c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LoginActionFooterDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return "LIST_ID_OTHER_OPTIONS_CONTAINER";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj2;
        return this.f167358a.equals(yvVar.f167358a) && this.f167359b.equals(yvVar.f167359b) && Intrinsics.f(this.f167360c, yvVar.f167360c) && Intrinsics.f(this.d, yvVar.d) && Intrinsics.f(this.e, yvVar.e) && Intrinsics.f(this.f, yvVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.a(232025170, 31, this.f167358a), 31, this.f167359b);
        p31.c cVar = this.f167360c;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53287g() {
        return this.f167360c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53288h() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53289j() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getI() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167360c = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof yv ? (yv) oldItem : null) == null) {
            return null;
        }
        yv yvVar = (yv) oldItem;
        return new zv(!yvVar.f167358a.equals(this.f167358a), !yvVar.f167359b.equals(this.f167359b));
    }
}
