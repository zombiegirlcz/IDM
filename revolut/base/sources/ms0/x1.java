package ms0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f208483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208485c;

    public x1(TextClause circleText, int i) {
        int i2 = R$attr.uikit_colorBackground;
        Intrinsics.checkNotNullParameter(circleText, "circleText");
        this.f208483a = circleText;
        this.f208484b = i;
        this.f208485c = i2;
    }

    @Override // ms0.y1
    public final int a() {
        return this.f208485c;
    }

    @Override // ms0.y1
    public final int b() {
        return this.f208484b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return this.f208483a.equals(x1Var.f208483a) && this.f208484b == x1Var.f208484b && this.f208485c == x1Var.f208485c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208485c) + j6.a.b(this.f208484b, this.f208483a.hashCode() * 31, 31);
    }
}
