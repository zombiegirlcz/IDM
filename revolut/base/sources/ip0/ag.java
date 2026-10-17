package ip0;

import com.revolut.core.ui_kit.delegates.ErrorChartDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ag implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f163438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f163439c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163441h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163442j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163443l;

    public ag(TextLocalisedClause title, ResourceImage image, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163437a = listId;
        this.f163438b = title;
        this.f163439c = image;
        this.d = positionInBox;
        this.e = null;
        this.f = null;
        this.f163440g = null;
        this.f163441h = null;
        this.i = i;
        this.f163442j = i;
        this.k = i;
        this.f163443l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ErrorChartDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53634a() {
        return this.f163437a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj2;
        return Intrinsics.f(this.f163437a, agVar.f163437a) && this.f163438b.equals(agVar.f163438b) && this.f163439c.equals(agVar.f163439c) && Intrinsics.f(this.d, agVar.d) && Intrinsics.f(this.e, agVar.e) && Intrinsics.f(this.f, agVar.f) && Intrinsics.f(this.f163440g, agVar.f163440g) && Intrinsics.f(this.f163441h, agVar.f163441h) && this.i == agVar.i && this.f163442j == agVar.f163442j && this.k == agVar.k && this.f163443l == agVar.f163443l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f163439c, t61.a.a(this.f163437a.hashCode() * 31, 31, this.f163438b), 31), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163440g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163441h;
        return Integer.hashCode(this.f163443l) + j6.a.b(this.k, j6.a.b(this.f163442j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163440g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f163442j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f163443l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163442j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f163441h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f163440g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163441h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ag ? (ag) oldItem : null) == null) {
            return null;
        }
        ag agVar = (ag) oldItem;
        return new bg(!agVar.f163438b.equals(this.f163438b), !agVar.f163439c.equals(this.f163439c));
    }
}
