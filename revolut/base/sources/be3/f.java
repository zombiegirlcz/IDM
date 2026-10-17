package be3;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.a f14656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14658c;
    public final Data d;
    public final Image e;

    public f(uc3.a cashbackBox, long j2, boolean z, Data destinationPocketData, Image image) {
        Intrinsics.checkNotNullParameter(cashbackBox, "cashbackBox");
        Intrinsics.checkNotNullParameter(destinationPocketData, "destinationPocketData");
        this.f14656a = cashbackBox;
        this.f14657b = j2;
        this.f14658c = z;
        this.d = destinationPocketData;
        this.e = image;
    }

    public static f a(f fVar, long j2, boolean z, Data destinationPocketData, Image image, int i) {
        long j3 = j2;
        uc3.a cashbackBox = fVar.f14656a;
        if ((i & 2) != 0) {
            j3 = fVar.f14657b;
        }
        if ((i & 4) != 0) {
            z = fVar.f14658c;
        }
        if ((i & 8) != 0) {
            destinationPocketData = fVar.d;
        }
        if ((i & 16) != 0) {
            image = fVar.e;
        }
        Image image2 = image;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(cashbackBox, "cashbackBox");
        Intrinsics.checkNotNullParameter(destinationPocketData, "destinationPocketData");
        return new f(cashbackBox, j3, z, destinationPocketData, image2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f14656a, fVar.f14656a) && this.f14657b == fVar.f14657b && this.f14658c == fVar.f14658c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, j6.a.c(a0.d.c(this.f14656a.hashCode() * 31, 31, this.f14657b), 31, this.f14658c), 31);
        Image image = this.e;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
