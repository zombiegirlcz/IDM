package tof;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b7 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f272650b;

    public b7(String code, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f272649a = code;
        this.f272650b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj2;
        return Intrinsics.f(this.f272649a, b7Var.f272649a) && Intrinsics.f(this.f272650b, b7Var.f272650b);
    }

    public final int hashCode() {
        return this.f272650b.hashCode() + (this.f272649a.hashCode() * 31);
    }
}
