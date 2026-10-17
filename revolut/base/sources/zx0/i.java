package zx0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f325997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325999c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f326000g;

    public i(Image image, int i, int i2, boolean z, boolean z3, String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f325997a = image;
        this.f325998b = i;
        this.f325999c = i2;
        this.d = z;
        this.e = z3;
        this.f = listId;
        this.f326000g = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.f326000g;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f325997a, iVar.f325997a) && this.f325998b == iVar.f325998b && this.f325999c == iVar.f325999c && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f326000g, iVar.f326000g);
    }

    public final int hashCode() {
        Image image = this.f325997a;
        int iC = p.a.c(j6.a.c(j6.a.c(j6.a.b(this.f325999c, j6.a.b(this.f325998b, (image == null ? 0 : image.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        Object obj2 = this.f326000g;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
