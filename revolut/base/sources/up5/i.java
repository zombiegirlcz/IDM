package up5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow.CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f281897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f281898c;

    public /* synthetic */ i(a0 a0Var, xi0.b bVar, int i) {
        this.f281896a = i;
        this.f281897b = a0Var;
        this.f281898c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        Object next;
        switch (this.f281896a) {
            case 0:
                a0 a0Var = this.f281897b;
                c cVar = a0Var.f281852b;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                wk5.a aVar = (wk5.a) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    bVar = this.f281898c;
                    if (zHasNext) {
                        next = it8.next();
                        CryptoAddress cryptoAddress = (CryptoAddress) next;
                        if (!Intrinsics.f(cryptoAddress.f71060b, bVar) || cryptoAddress.f71063h != aVar) {
                        }
                    } else {
                        next = null;
                    }
                }
                CryptoAddress cryptoAddress2 = (CryptoAddress) next;
                if (cryptoAddress2 != null || list.isEmpty()) {
                    String str = cryptoAddress2 != null ? cryptoAddress2.f71059a : null;
                    if (str != null && !str.equals(((od0.i) ((e) cVar).w0().get()).f224257a)) {
                        te0.e eVarW0 = ((e) cVar).w0();
                        od0.i.Companion.getClass();
                        return te0.w.z0(eVarW0, od0.h.a(str));
                    }
                } else if (list2.contains(aVar)) {
                    CryptoAddress cryptoAddress3 = (CryptoAddress) list.get(0);
                    CryptoAddressDestinationTag cryptoAddressDestinationTag = cryptoAddress3.d;
                    String str2 = cryptoAddressDestinationTag instanceof CryptoAddressDestinationTag.Optional ? ((CryptoAddressDestinationTag.Optional) cryptoAddressDestinationTag).f71071a : null;
                    mm.d dVar = a0Var.e;
                    Intrinsics.h(bVar);
                    CryptoAddressHostingInfo cryptoAddressHostingInfo = null;
                    String str3 = cryptoAddress3.f71061c;
                    String str4 = cryptoAddress3.e;
                    CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddress3.f71065l;
                    CryptoAddressCounterparty cryptoAddressCounterparty = cryptoAddress3.f71068p;
                    wk5.h hVar = cryptoAddressCounterparty != null ? cryptoAddressCounterparty.d : null;
                    String str5 = cryptoAddressCounterparty != null ? cryptoAddressCounterparty.f : null;
                    CryptoAddressRecipientDetails cryptoAddressRecipientDetails2 = cryptoAddressCounterparty != null ? cryptoAddressCounterparty.f70980g : null;
                    if (hVar != null && str5 != null && cryptoAddressRecipientDetails2 != null) {
                        cryptoAddressHostingInfo = new CryptoAddressHostingInfo(hVar, str5, cryptoAddressRecipientDetails2);
                    }
                    return dVar.c0(new CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction(bVar, aVar, str3, str2, str4, cryptoAddressRecipientDetails, false, null, cryptoAddressHostingInfo));
                }
                return pfm.m.f235744a;
            default:
                CryptoAddress beneficiary = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return te0.w.o0(p0.f264003c, new twb.b0(this.f281897b, this.f281898c, beneficiary, null, 26));
        }
    }
}
