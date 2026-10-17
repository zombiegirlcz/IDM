package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up0 f166557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f166558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166559c;

    public tp0(up0 originalModel, Integer num, int i) {
        Intrinsics.checkNotNullParameter(originalModel, "originalModel");
        this.f166557a = originalModel;
        this.f166558b = num;
        this.f166559c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tp0)) {
            return false;
        }
        tp0 tp0Var = (tp0) obj2;
        return Intrinsics.f(this.f166557a, tp0Var.f166557a) && Intrinsics.f(this.f166558b, tp0Var.f166558b) && this.f166559c == tp0Var.f166559c;
    }

    public final int hashCode() {
        int iHashCode = this.f166557a.hashCode() * 31;
        Integer num = this.f166558b;
        return Integer.hashCode(this.f166559c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
