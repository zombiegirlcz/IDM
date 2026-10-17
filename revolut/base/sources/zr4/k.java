package zr4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f324570a;

    public k(ArrayList repaymentMethods) {
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        this.f324570a = repaymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f324570a.equals(((k) obj2).f324570a);
    }

    public final int hashCode() {
        return this.f324570a.hashCode();
    }
}
