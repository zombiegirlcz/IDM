package ip0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cs implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f163789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163790c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163792h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163793j;

    public cs(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163788a = listId;
        this.f163789b = c.d.f249513a;
        int i = R$attr.uikit_dp0;
        this.f163790c = i;
        this.d = i;
        this.e = i;
        this.f = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LargeActionButtonLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52138b() {
        return this.f163788a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cs) && Intrinsics.f(this.f163788a, ((cs) obj2).f163788a);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f163790c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163790c = i;
    }

    public final int hashCode() {
        return this.f163788a.hashCode();
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53344m() {
        return this.f163791g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163789b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53345n() {
        return this.f163792h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52143l() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52145n() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53343l() {
        return this.f163789b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53346p() {
        return this.f163793j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163791g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52144m() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163792h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163793j = cVar;
    }
}
