package lo1;

import com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayBill f197366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197368c;

    public e(BPayBill bPayBill, String referenceNumber, String str) {
        Intrinsics.checkNotNullParameter(bPayBill, "bPayBill");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        this.f197366a = bPayBill;
        this.f197367b = referenceNumber;
        this.f197368c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f197366a, eVar.f197366a) && Intrinsics.f(this.f197367b, eVar.f197367b) && Intrinsics.f(this.f197368c, eVar.f197368c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f197366a.hashCode() * 31, 31, this.f197367b);
        String str = this.f197368c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
