package xkf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f306729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f306731c;

    public m(a3 transaction, String senderFirstName, j approver) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(senderFirstName, "senderFirstName");
        Intrinsics.checkNotNullParameter(approver, "approver");
        this.f306729a = transaction;
        this.f306730b = senderFirstName;
        this.f306731c = approver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f306729a, mVar.f306729a) && Intrinsics.f(this.f306730b, mVar.f306730b) && Intrinsics.f(this.f306731c, mVar.f306731c);
    }

    public final int hashCode() {
        return this.f306731c.hashCode() + p.a.c(this.f306729a.hashCode() * 31, 31, this.f306730b);
    }
}
