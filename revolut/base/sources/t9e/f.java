package t9e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f268983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268985c;

    public f(qua.p recurringPayment, List linkedTransactions, String str) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(linkedTransactions, "linkedTransactions");
        this.f268983a = recurringPayment;
        this.f268984b = linkedTransactions;
        this.f268985c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268983a, fVar.f268983a) && Intrinsics.f(this.f268984b, fVar.f268984b) && Intrinsics.f(this.f268985c, fVar.f268985c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f268983a.hashCode() * 31, 31, this.f268984b);
        String str = this.f268985c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
