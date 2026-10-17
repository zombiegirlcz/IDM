package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b6 extends c6 {
    public final String d;
    public final Image e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f209602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209603h;
    public final Object i;

    /* JADX WARN: Illegal instructions before constructor call */
    public b6(String listId, ResourceImage resourceImage, Clause label, ResourceImage resourceImage2, boolean z, Object obj2, int i) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        resourceImage2 = (i & 8) != 0 ? null : resourceImage2;
        z = (i & 16) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        super(obj2, z);
        this.d = listId;
        this.e = resourceImage;
        this.f = label;
        this.f209602g = resourceImage2;
        this.f209603h = z;
        this.i = obj2;
    }

    @Override // mx0.c6, qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return this.i;
    }

    @Override // mx0.c6, koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53304a() {
        return this.d;
    }

    @Override // mx0.c6
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return Intrinsics.f(this.d, b6Var.d) && Intrinsics.f(this.e, b6Var.e) && Intrinsics.f(this.f, b6Var.f) && Intrinsics.f(this.f209602g, b6Var.f209602g) && this.f209603h == b6Var.f209603h && this.i.equals(b6Var.i);
    }

    @Override // mx0.c6
    public final boolean f() {
        return this.f209603h;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Image image = this.e;
        int iA = p.a.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f);
        Image image2 = this.f209602g;
        return this.i.hashCode() + j6.a.c(j6.a.c((iA + (image2 != null ? image2.hashCode() : 0)) * 31, 31, this.f209603h), 31, true);
    }
}
