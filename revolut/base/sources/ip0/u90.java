package ip0;

import com.revolut.core.ui_kit.delegates.ReactionsKeyboardItemDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u90 implements koi.j, qv0.p, o31.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f166633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166635c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f166636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166637h;
    public p31.c i;

    public u90(Image image, int i, int i2, boolean z, boolean z3, String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166633a = image;
        this.f166634b = i;
        this.f166635c = i2;
        this.d = z;
        this.e = z3;
        this.f = listId;
        this.f166636g = obj2;
        this.f166637h = null;
        this.i = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ReactionsKeyboardItemDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.f166636g;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52519a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj2;
        return Intrinsics.f(this.f166633a, u90Var.f166633a) && this.f166634b == u90Var.f166634b && this.f166635c == u90Var.f166635c && this.d == u90Var.d && this.e == u90Var.e && Intrinsics.f(this.f, u90Var.f) && Intrinsics.f(this.f166636g, u90Var.f166636g) && Intrinsics.f(this.f166637h, u90Var.f166637h) && Intrinsics.f(this.i, u90Var.i);
    }

    public final int hashCode() {
        Image image = this.f166633a;
        int iC = p.a.c(j6.a.c(j6.a.c(j6.a.b(this.f166635c, j6.a.b(this.f166634b, (image == null ? 0 : image.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        Object obj2 = this.f166636g;
        int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.f166637h;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52531s() {
        return this.f166637h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52528p() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52530r() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52529q() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166637h = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        u90 u90Var = oldItem instanceof u90 ? (u90) oldItem : null;
        if (u90Var != null) {
            return new v90((u90Var.f166635c == this.f166635c && u90Var.f166634b == this.f166634b) ? false : true, !Intrinsics.f(u90Var.f166633a, this.f166633a), u90Var.d != this.d, u90Var.e != this.e);
        }
        return null;
    }
}
