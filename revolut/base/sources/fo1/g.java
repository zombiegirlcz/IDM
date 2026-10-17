package fo1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BPayBillerData f136751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f136752c;
    public final dj0.d d;
    public final TransferScheduleData e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScreenConfiguration f136753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ApmQuote f136754h;
    public final dj0.d i;

    public g(Data pocketData, BPayBillerData billerData, Clause clause, dj0.d amount, TransferScheduleData transferScheduleData, boolean z, ScreenConfiguration screenConfiguration, ApmQuote apmQuote, dj0.d availableAmount) {
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(billerData, "billerData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferScheduleData, "transferScheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(availableAmount, "availableAmount");
        this.f136750a = pocketData;
        this.f136751b = billerData;
        this.f136752c = clause;
        this.d = amount;
        this.e = transferScheduleData;
        this.f = z;
        this.f136753g = screenConfiguration;
        this.f136754h = apmQuote;
        this.i = availableAmount;
    }

    public static g a(g gVar, Data data, BPayBillerData bPayBillerData, Clause clause, dj0.d dVar, TransferScheduleData transferScheduleData, ApmQuote apmQuote, dj0.d dVar2, int i) {
        if ((i & 1) != 0) {
            data = gVar.f136750a;
        }
        Data pocketData = data;
        if ((i & 2) != 0) {
            bPayBillerData = gVar.f136751b;
        }
        BPayBillerData billerData = bPayBillerData;
        Clause clause2 = (i & 4) != 0 ? gVar.f136752c : clause;
        dj0.d amount = (i & 8) != 0 ? gVar.d : dVar;
        TransferScheduleData transferScheduleData2 = (i & 16) != 0 ? gVar.e : transferScheduleData;
        boolean z = gVar.f;
        ScreenConfiguration screenConfiguration = gVar.f136753g;
        ApmQuote apmQuote2 = (i & 128) != 0 ? gVar.f136754h : apmQuote;
        dj0.d availableAmount = (i & 256) != 0 ? gVar.i : dVar2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(billerData, "billerData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferScheduleData2, "transferScheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(availableAmount, "availableAmount");
        return new g(pocketData, billerData, clause2, amount, transferScheduleData2, z, screenConfiguration, apmQuote2, availableAmount);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f136750a, gVar.f136750a) && Intrinsics.f(this.f136751b, gVar.f136751b) && Intrinsics.f(this.f136752c, gVar.f136752c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f136753g, gVar.f136753g) && Intrinsics.f(this.f136754h, gVar.f136754h) && Intrinsics.f(this.i, gVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f136751b.hashCode() + (this.f136750a.hashCode() * 31)) * 31;
        Clause clause = this.f136752c;
        int iHashCode2 = (this.f136753g.hashCode() + j6.a.c(h30.l.f(this.e, v7.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31), 31, this.f)) * 31;
        ApmQuote apmQuote = this.f136754h;
        return this.i.hashCode() + ((iHashCode2 + (apmQuote != null ? apmQuote.hashCode() : 0)) * 31);
    }
}
