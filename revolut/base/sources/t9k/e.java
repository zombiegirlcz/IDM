package t9k;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements f {
    public static yqi.d a(d validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        ContactTargetAccount contactTargetAccount = validationData.f269050a.f102271b;
        SplitBillLinkDetails splitBillLinkDetails = contactTargetAccount instanceof ContactTargetAccount.SplitBillLink ? ((ContactTargetAccount.SplitBillLink) contactTargetAccount).f102260a : null;
        if (splitBillLinkDetails == null) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        dj0.d dVar = splitBillLinkDetails.i;
        dj0.d dVar2 = splitBillLinkDetails.f79948j;
        long j2 = dVar.f115082a - (dVar2 != null ? dVar2.f115082a : 0L);
        if (validationData.f269051b > j2) {
            return new yqi.d(validationData, new urf.a(new dj0.d(j2, dVar.f115083b)));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((d) obj2);
    }
}
