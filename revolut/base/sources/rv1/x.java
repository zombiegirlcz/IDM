package rv1;

import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements g12.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebContact f257683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f257684b;

    public x(BrebContact contact, TransferMoneyPocket funding) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(funding, "funding");
        this.f257683a = contact;
        this.f257684b = funding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f257683a, xVar.f257683a) && Intrinsics.f(this.f257684b, xVar.f257684b);
    }

    public final int hashCode() {
        return this.f257684b.hashCode() + (this.f257683a.hashCode() * 31);
    }
}
