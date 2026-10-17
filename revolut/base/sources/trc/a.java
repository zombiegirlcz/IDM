package trc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273779b;

    public a(String messageSubject, String payrollDetails) {
        Intrinsics.checkNotNullParameter(messageSubject, "messageSubject");
        Intrinsics.checkNotNullParameter(payrollDetails, "payrollDetails");
        this.f273778a = messageSubject;
        this.f273779b = payrollDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f273778a, aVar.f273778a) && Intrinsics.f(this.f273779b, aVar.f273779b);
    }

    public final int hashCode() {
        return this.f273779b.hashCode() + (this.f273778a.hashCode() * 31);
    }
}
