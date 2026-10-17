package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f167342c;

    public yn0(int i, Image image, Integer num) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f167340a = image;
        this.f167341b = i;
        this.f167342c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj2;
        return Intrinsics.f(this.f167340a, yn0Var.f167340a) && this.f167341b == yn0Var.f167341b && Intrinsics.f(this.f167342c, yn0Var.f167342c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f167341b, this.f167340a.hashCode() * 31, 31);
        Integer num = this.f167342c;
        return iB + (num == null ? 0 : num.hashCode());
    }
}
