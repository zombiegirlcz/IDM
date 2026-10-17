package xkf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f306724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f306726c;
    public final dj0.d d;

    public l(a3 transaction, String senderFirstName, j approver, dj0.d limit) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(senderFirstName, "senderFirstName");
        Intrinsics.checkNotNullParameter(approver, "approver");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f306724a = transaction;
        this.f306725b = senderFirstName;
        this.f306726c = approver;
        this.d = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f306724a, lVar.f306724a) && Intrinsics.f(this.f306725b, lVar.f306725b) && Intrinsics.f(this.f306726c, lVar.f306726c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f306726c.hashCode() + p.a.c(this.f306724a.hashCode() * 31, 31, this.f306725b)) * 31);
    }
}
