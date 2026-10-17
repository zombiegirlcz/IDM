package mel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements d0 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f204781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f204783c;

    public x(BigDecimal number, String placeholder, c0 style) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f204781a = number;
        this.f204782b = placeholder;
        this.f204783c = style;
    }

    @Override // mel.d0
    public final String a() {
        return this.f204782b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f204781a, xVar.f204781a) && Intrinsics.f(this.f204782b, xVar.f204782b) && this.f204783c == xVar.f204783c;
    }

    @Override // mel.d0
    public final c0 h() {
        return this.f204783c;
    }

    public final int hashCode() {
        return this.f204783c.hashCode() + p.a.c(this.f204781a.hashCode() * 31, 31, this.f204782b);
    }
}
