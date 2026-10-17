package zod;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f324015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324017c;
    public final int d;

    public o0(Image mapImage, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(mapImage, "mapImage");
        this.f324015a = mapImage;
        this.f324016b = i;
        this.f324017c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        if (!Intrinsics.f(this.f324015a, o0Var.f324015a) || this.f324016b != o0Var.f324016b || this.f324017c != o0Var.f324017c || this.d != o0Var.d) {
            return false;
        }
        Object obj3 = m.f324008a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return m.f324008a.hashCode() + j6.a.b(this.d, j6.a.b(this.f324017c, j6.a.b(this.f324016b, this.f324015a.hashCode() * 31, 31), 31), 31);
    }
}
