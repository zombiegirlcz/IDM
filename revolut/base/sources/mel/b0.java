package mel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements d0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f204731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f204733c;

    public b0(BigDecimal value, String placeholder, c0 style) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f204731a = value;
        this.f204732b = placeholder;
        this.f204733c = style;
    }

    @Override // mel.d0
    public final String a() {
        return this.f204732b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f204731a, b0Var.f204731a) && Intrinsics.f(this.f204732b, b0Var.f204732b) && this.f204733c == b0Var.f204733c;
    }

    @Override // mel.d0
    public final c0 h() {
        return this.f204733c;
    }

    public final int hashCode() {
        return this.f204733c.hashCode() + p.a.c(this.f204731a.hashCode() * 31, 31, this.f204732b);
    }
}
