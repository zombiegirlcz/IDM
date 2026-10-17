package gl9;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import il9.i;
import il9.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends f {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // gl9.f
    public final Object Z2(il9.c cVar, ScannedBillDetails scannedBillDetails, l lVar, Continuation continuation) {
        u2j.d dVar;
        BeneficiaryCreationKompotInputData.CreationConfiguration defaultCreation;
        Pair pair;
        if (!(cVar instanceof i)) {
            return Boolean.FALSE;
        }
        i iVar = (i) cVar;
        Map map = iVar.d;
        dj0.d dVar2 = iVar.f162186c;
        BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default r2 = new BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default(new TransferMoneyPocket(dVar2, null, 2), scannedBillDetails, iVar.f162187g, 2);
        String str = lVar.f162189a;
        String str2 = iVar.f162185b;
        String str3 = map != null ? (String) map.get("transferType") : null;
        String str4 = map != null ? (String) map.get("transferVendor") : null;
        Set setB = y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachExtractionTaskId(str));
        if (!Intrinsics.f(str3, "MOBILE_WALLET") || str4 == null) {
            wi0.b.Companion.getClass();
            wi0.b bVarA = wi0.a.a(str2);
            Map map2 = iVar.e;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                try {
                    pair = new Pair(AccountFieldType.valueOf((String) entry.getKey()), (String) entry.getValue());
                } catch (Exception e) {
                    hx7.e.h(e);
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map mapT = r0.t(arrayList);
            int i = e.f144581a[iVar.f.ordinal()];
            if (i == 1) {
                dVar = u2j.d.PERSONAL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = u2j.d.BUSINESS;
            }
            defaultCreation = new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, bVarA, null, mapT, dVar, setB, 11);
        } else {
            wi0.b.Companion.getClass();
            defaultCreation = new BeneficiaryCreationKompotInputData.CreationConfiguration.MobileWallet(wi0.a.a(str2), dVar2.f115083b, new BeneficiaryRouteType.MobileWallet(str4), setB);
        }
        A2(new BeneficiaryCreationDestination(r2, defaultCreation));
        return Boolean.TRUE;
    }
}
