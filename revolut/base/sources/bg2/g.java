package bg2;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteLimits;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f15052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f15053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15054c;
    public final String d;
    public final io3.d e;
    public final PaymentPocketInfo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccountId f15055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15056h;
    public final TransferScheduleData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15057j;
    public final ScreenConfiguration k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ApmQuoteLimits f15058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15059m;

    public g(dj0.d amount, UpiTransferFlowContract$Recipient recipient, boolean z, String reference, io3.d pocket, PaymentPocketInfo paymentPocketInfo, AccountId accountId, boolean z3, TransferScheduleData scheduleData, boolean z4, ScreenConfiguration screenConfiguration, ApmQuoteLimits apmQuoteLimits, boolean z6) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f15052a = amount;
        this.f15053b = recipient;
        this.f15054c = z;
        this.d = reference;
        this.e = pocket;
        this.f = paymentPocketInfo;
        this.f15055g = accountId;
        this.f15056h = z3;
        this.i = scheduleData;
        this.f15057j = z4;
        this.k = screenConfiguration;
        this.f15058l = apmQuoteLimits;
        this.f15059m = z6;
    }

    public static g a(g gVar, dj0.d dVar, String str, io3.d dVar2, PaymentPocketInfo paymentPocketInfo, AccountId accountId, TransferScheduleData transferScheduleData, boolean z, ApmQuoteLimits apmQuoteLimits, int i) {
        dj0.d amount = (i & 1) != 0 ? gVar.f15052a : dVar;
        UpiTransferFlowContract$Recipient recipient = gVar.f15053b;
        boolean z3 = gVar.f15054c;
        String reference = (i & 8) != 0 ? gVar.d : str;
        io3.d pocket = (i & 16) != 0 ? gVar.e : dVar2;
        PaymentPocketInfo paymentPocketInfo2 = (i & 32) != 0 ? gVar.f : paymentPocketInfo;
        AccountId accountId2 = (i & 64) != 0 ? gVar.f15055g : accountId;
        boolean z4 = gVar.f15056h;
        TransferScheduleData scheduleData = (i & 256) != 0 ? gVar.i : transferScheduleData;
        boolean z6 = (i & 512) != 0 ? gVar.f15057j : z;
        ScreenConfiguration screenConfiguration = gVar.k;
        ApmQuoteLimits apmQuoteLimits2 = (i & 2048) != 0 ? gVar.f15058l : apmQuoteLimits;
        boolean z11 = gVar.f15059m;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        return new g(amount, recipient, z3, reference, pocket, paymentPocketInfo2, accountId2, z4, scheduleData, z6, screenConfiguration, apmQuoteLimits2, z11);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f15052a, gVar.f15052a) && Intrinsics.f(this.f15053b, gVar.f15053b) && this.f15054c == gVar.f15054c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f15055g, gVar.f15055g) && this.f15056h == gVar.f15056h && Intrinsics.f(this.i, gVar.i) && this.f15057j == gVar.f15057j && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f15058l, gVar.f15058l) && this.f15059m == gVar.f15059m;
    }

    public final int hashCode() {
        int iG = h30.l.g(this.e, p.a.c(j6.a.c((this.f15053b.hashCode() + (this.f15052a.hashCode() * 31)) * 31, 31, this.f15054c), 31, this.d), 31);
        PaymentPocketInfo paymentPocketInfo = this.f;
        int iHashCode = (this.k.hashCode() + j6.a.c(h30.l.f(this.i, j6.a.c(h30.l.b(this.f15055g, (iG + (paymentPocketInfo == null ? 0 : paymentPocketInfo.hashCode())) * 31, 31), 31, this.f15056h), 31), 31, this.f15057j)) * 31;
        ApmQuoteLimits apmQuoteLimits = this.f15058l;
        return Boolean.hashCode(this.f15059m) + ((iHashCode + (apmQuoteLimits != null ? apmQuoteLimits.hashCode() : 0)) * 31);
    }
}
