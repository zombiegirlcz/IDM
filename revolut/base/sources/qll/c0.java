package qll;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f247579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f247580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f247581c;
    public final String d;
    public final Image e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f247582g;

    public c0(boolean z, boolean z3, ResourceImage resourceImage, String str, Image fallbackImage, List list, List items) {
        Intrinsics.checkNotNullParameter(fallbackImage, "fallbackImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247579a = z;
        this.f247580b = z3;
        this.f247581c = resourceImage;
        this.d = str;
        this.e = fallbackImage;
        this.f = list;
        this.f247582g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f247582g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f247579a == c0Var.f247579a && this.f247580b == c0Var.f247580b && Intrinsics.f(this.f247581c, c0Var.f247581c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f247582g, c0Var.f247582g);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f247579a) * 31, 31, this.f247580b);
        ResourceImage resourceImage = this.f247581c;
        int iHashCode = (iC + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31;
        String str = this.d;
        int iC2 = a10.b.c(this.e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        List list = this.f;
        return this.f247582g.hashCode() + ((iC2 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
