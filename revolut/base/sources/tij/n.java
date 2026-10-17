package tij;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f271561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f271562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f271563c;

    public n(int i, Clause clause, Integer num) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f271561a = clause;
        this.f271562b = num;
        this.f271563c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f271561a, nVar.f271561a) && Intrinsics.f(this.f271562b, nVar.f271562b) && this.f271563c == nVar.f271563c;
    }

    public final int hashCode() {
        int iHashCode = this.f271561a.hashCode() * 31;
        Integer num = this.f271562b;
        return Integer.hashCode(this.f271563c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
