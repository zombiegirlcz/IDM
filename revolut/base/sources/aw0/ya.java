package aw0;

import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ya {

    @NotNull
    public static final xa Companion = new xa();
    public static final ya e;
    public static final ya f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ya f10633g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10636c;
    public final int d;

    static {
        int i = R$attr.uikit_colorPerformancePositive;
        int i2 = R$attr.uikit_colorGreyTone50;
        int i3 = R$attr.uikit_colorPerformancePositive_30;
        int i5 = R$attr.uikit_colorTransparent;
        e = new ya(i, i2, i3, i5);
        f = new ya(R$attr.uikit_colorPerformanceNegative, i2, R$attr.uikit_colorPerformanceNegative_30, i5);
        f10633g = new ya(R$attr.uikit_colorGreyTone20, i2, 0, 0);
    }

    public ya(int i, int i2, int i3, int i5) {
        this.f10634a = i;
        this.f10635b = i2;
        this.f10636c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj2;
        return this.f10634a == yaVar.f10634a && this.f10635b == yaVar.f10635b && this.f10636c == yaVar.f10636c && this.d == yaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f10636c, j6.a.b(this.f10635b, Integer.hashCode(this.f10634a) * 31, 31), 31);
    }
}
