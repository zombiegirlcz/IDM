package dye;

import cue.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f121096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121098c;

    public b(d paymentInfo, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        this.f121096a = paymentInfo;
        this.f121097b = z;
        this.f121098c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121096a, bVar.f121096a) && this.f121097b == bVar.f121097b && this.f121098c == bVar.f121098c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121098c) + j6.a.c(this.f121096a.hashCode() * 31, 31, this.f121097b);
    }
}
