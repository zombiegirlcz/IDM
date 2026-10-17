package ip0;

import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class za0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f167434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167435c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167437h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167438j;
    public qv0.c k;

    public za0(String listId, ArrayList rewards) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f167433a = listId;
        this.f167434b = rewards;
        this.f167435c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.k = new c.e((qv0.h) null, 3);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RewardsGridLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55135b() {
        return this.f167433a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj2;
        return Intrinsics.f(this.f167433a, za0Var.f167433a) && this.f167434b.equals(za0Var.f167434b) && this.f167435c == za0Var.f167435c && this.d == za0Var.d && this.e == za0Var.e && this.f == za0Var.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f167435c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167435c = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f167435c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f167434b, this.f167433a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f167438j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.f167436g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167437h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f167437h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167438j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167436g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
