package s02;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestChannel.APM f258816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferDestination f258817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmContact f258818c;
    public final d d;
    public final String e;
    public final Long f;

    public c(MoneyRequestChannel.APM origin, ApmTransferDestination apmTransferDestination, ApmContact apmContact, d paymentAmount, String str, Long l2) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(apmContact, "apmContact");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        this.f258816a = origin;
        this.f258817b = apmTransferDestination;
        this.f258818c = apmContact;
        this.d = paymentAmount;
        this.e = str;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258816a, cVar.f258816a) && Intrinsics.f(this.f258817b, cVar.f258817b) && Intrinsics.f(this.f258818c, cVar.f258818c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f258816a.hashCode() * 31;
        ApmTransferDestination apmTransferDestination = this.f258817b;
        int iC = v7.c((this.f258818c.hashCode() + ((iHashCode + (apmTransferDestination == null ? 0 : apmTransferDestination.hashCode())) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
