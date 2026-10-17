package eg2;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f125527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125528c;
    public final TransferScheduleData d;
    public final h e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScreenConfiguration f125529g;

    public g(dj0.d amount, UpiTransferFlowContract$Recipient recipient, String reference, TransferScheduleData scheduleData, h hVar, Data transferData, ScreenConfiguration screenConfiguration) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f125526a = amount;
        this.f125527b = recipient;
        this.f125528c = reference;
        this.d = scheduleData;
        this.e = hVar;
        this.f = transferData;
        this.f125529g = screenConfiguration;
    }

    public static g a(g gVar, TransferScheduleData transferScheduleData, h hVar, Data data, int i) {
        dj0.d amount = gVar.f125526a;
        UpiTransferFlowContract$Recipient recipient = gVar.f125527b;
        String reference = gVar.f125528c;
        if ((i & 8) != 0) {
            transferScheduleData = gVar.d;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        if ((i & 16) != 0) {
            hVar = gVar.e;
        }
        h hVar2 = hVar;
        if ((i & 32) != 0) {
            data = gVar.f;
        }
        Data transferData = data;
        ScreenConfiguration screenConfiguration = gVar.f125529g;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        return new g(amount, recipient, reference, scheduleData, hVar2, transferData, screenConfiguration);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f125526a, gVar.f125526a) && Intrinsics.f(this.f125527b, gVar.f125527b) && Intrinsics.f(this.f125528c, gVar.f125528c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f125529g, gVar.f125529g);
    }

    public final int hashCode() {
        int iF = h30.l.f(this.d, p.a.c((this.f125527b.hashCode() + (this.f125526a.hashCode() * 31)) * 31, 31, this.f125528c), 31);
        h hVar = this.e;
        return this.f125529g.hashCode() + kii.e.c(this.f, (iF + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
    }
}
