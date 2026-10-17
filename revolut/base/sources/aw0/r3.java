package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();
    public static final r3 d = new r3(Integer.valueOf(R$attr.uikit_colorPerformancePositive));
    public static final r3 e = new r3(Integer.valueOf(R$attr.uikit_colorPerformanceNegative));
    public static final r3 f = new r3(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10511c;

    public r3(Integer num) {
        int i = R$attr.uikit_colorGreyTone20;
        int i2 = R$attr.uikit_colorGreyTone50;
        this.f10509a = num;
        this.f10510b = i;
        this.f10511c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.f10509a, r3Var.f10509a) && this.f10510b == r3Var.f10510b && this.f10511c == r3Var.f10511c;
    }

    public final int hashCode() {
        Integer num = this.f10509a;
        return Integer.hashCode(this.f10511c) + j6.a.b(this.f10510b, (num == null ? 0 : num.hashCode()) * 31, 31);
    }
}
