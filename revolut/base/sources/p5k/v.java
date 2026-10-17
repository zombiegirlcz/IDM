package p5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9l.a f233187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f233188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f233189c;

    public v(n9l.a exchangeRate, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f233187a = exchangeRate;
        this.f233188b = z;
        this.f233189c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f233187a, vVar.f233187a) && this.f233188b == vVar.f233188b && this.f233189c == vVar.f233189c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233189c) + j6.a.c(this.f233187a.hashCode() * 31, 31, this.f233188b);
    }
}
