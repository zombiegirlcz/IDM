package ms0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0.b f208475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208477c;

    public w1(yv0.b mapMarkerIcon, int i) {
        int i2 = R$attr.uikit_colorBackground;
        Intrinsics.checkNotNullParameter(mapMarkerIcon, "mapMarkerIcon");
        this.f208475a = mapMarkerIcon;
        this.f208476b = i;
        this.f208477c = i2;
    }

    @Override // ms0.y1
    public final int a() {
        return this.f208477c;
    }

    @Override // ms0.y1
    public final int b() {
        return this.f208476b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return this.f208475a.equals(w1Var.f208475a) && this.f208476b == w1Var.f208476b && this.f208477c == w1Var.f208477c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208477c) + j6.a.b(this.f208476b, this.f208475a.hashCode() * 31, 31);
    }
}
