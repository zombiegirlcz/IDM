package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f163972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f163974c;
    public final int d;
    public final int e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f163975g;

    public dy(Image frontImage, Image backImage, int i, int i2, int i3, Integer num, Integer num2, int i5) {
        i = (i5 & 64) != 0 ? -16777216 : i;
        i2 = (i5 & 128) != 0 ? -16777216 : i2;
        i3 = (i5 & 256) != 0 ? -7829368 : i3;
        num2 = (i5 & 1024) != 0 ? null : num2;
        Intrinsics.checkNotNullParameter(frontImage, "frontImage");
        Intrinsics.checkNotNullParameter(backImage, "backImage");
        this.f163972a = frontImage;
        this.f163973b = backImage;
        this.f163974c = i;
        this.d = i2;
        this.e = i3;
        this.f = num;
        this.f163975g = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj2;
        return this.f163972a.equals(dyVar.f163972a) && this.f163973b.equals(dyVar.f163973b) && this.f163974c == dyVar.f163974c && this.d == dyVar.d && this.e == dyVar.e && Intrinsics.f(this.f, dyVar.f) && Intrinsics.f(this.f163975g, dyVar.f163975g);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f163974c, j6.a.b(-16777216, j6.a.b(-7829368, j6.a.b(-16777216, j6.a.b(-16777216, p.a.b(this.f163972a.hashCode() * 31, 31, this.f163973b), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f163975g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
