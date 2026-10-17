package c64;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu3.e f21634a;

    public m(eu3.e calculatorDetailsContent) {
        Intrinsics.checkNotNullParameter(calculatorDetailsContent, "calculatorDetailsContent");
        this.f21634a = calculatorDetailsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f21634a, ((m) obj2).f21634a);
    }

    public final int hashCode() {
        return this.f21634a.hashCode();
    }
}
