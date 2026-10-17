package ip0;

import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class zp implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f167528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f167529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167530c;
    public final int d;
    public final int e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167532h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f167533j;

    public zp(UrlImage urlImage) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("ITEM_IMAGE_ATTACHMENT_ID", "listId");
        this.f167528a = urlImage;
        this.f167529b = i;
        this.f167530c = i;
        this.d = i;
        this.e = i;
        this.f = null;
        this.f167531g = null;
        this.f167532h = null;
        this.i = null;
        this.f167533j = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ImageAttachmentDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59201a() {
        return "ITEM_IMAGE_ATTACHMENT_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj2;
        return this.f167528a.equals(zpVar.f167528a) && this.f167529b == zpVar.f167529b && this.f167530c == zpVar.f167530c && this.d == zpVar.d && this.e == zpVar.e && Intrinsics.f(this.f, zpVar.f) && Intrinsics.f(this.f167531g, zpVar.f167531g) && Intrinsics.f(this.f167532h, zpVar.f167532h) && Intrinsics.f(this.i, zpVar.i) && Intrinsics.f(this.f167533j, zpVar.f167533j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.f167529b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167529b = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f167530c, j6.a.b(this.f167529b, v7.g(this.f167528a, 2025678425, 31), 31), 31), 31), 31);
        p31.c cVar = this.f;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167531g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167532h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return this.f167533j.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167533j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52330l() {
        return this.f167531g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167532h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52333p() {
        return this.f167530c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52335r() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167530c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52329j() {
        return this.f167533j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52332n() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52331m() {
        return this.f167532h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52334q() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167531g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof zp ? (zp) oldItem : null) == null) {
            return null;
        }
        return new aq(!this.f167528a.equals(r3.f167528a));
    }
}
