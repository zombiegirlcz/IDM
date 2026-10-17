package yfe;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class w1 extends t1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f313319b;

    public /* synthetic */ w1(int i, BigDecimal bigDecimal) {
        if (1 == (i & 1)) {
            this.f313319b = bigDecimal;
        } else {
            qlm.j1.f(u1.f313310a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w1) && Intrinsics.f(this.f313319b, ((w1) obj2).f313319b);
    }

    public final int hashCode() {
        return this.f313319b.hashCode();
    }

    public w1(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f313319b = value;
    }
}
