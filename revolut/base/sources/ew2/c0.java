package ew2;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f130007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f130008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f130009c;
    public final boolean d;
    public final Image e;
    public final al4.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResourceImage f130010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f130011h;

    public c0(h93.f0 f0Var, boolean z, boolean z3, boolean z4, Image image, al4.a aVar, ResourceImage resourceImage, boolean z6) {
        this.f130007a = f0Var;
        this.f130008b = z;
        this.f130009c = z3;
        this.d = z4;
        this.e = image;
        this.f = aVar;
        this.f130010g = resourceImage;
        this.f130011h = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f130007a, c0Var.f130007a) && this.f130008b == c0Var.f130008b && this.f130009c == c0Var.f130009c && this.d == c0Var.d && Intrinsics.f(this.e, c0Var.e) && this.f == c0Var.f && Intrinsics.f(this.f130010g, c0Var.f130010g) && this.f130011h == c0Var.f130011h;
    }

    public final int hashCode() {
        h93.f0 f0Var = this.f130007a;
        int iC = j6.a.c(j6.a.c(j6.a.c((f0Var == null ? 0 : f0Var.hashCode()) * 31, 31, this.f130008b), 31, this.f130009c), 31, this.d);
        Image image = this.e;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        al4.a aVar = this.f;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ResourceImage resourceImage = this.f130010g;
        return Boolean.hashCode(this.f130011h) + ((iHashCode2 + (resourceImage != null ? resourceImage.hashCode() : 0)) * 31);
    }
}
