package ikf;

import akf.t1;
import akf.v1;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$SendToPayerData;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import elf.s0;
import java.util.LinkedHashMap;
import java.util.Map;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tof.r1;
import yji.n;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f161959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f161960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c f161961n;
    public final com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.b f161962p;

    public j(h0 commonDataSource, m1 juniorDataSource, com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c sendToPayerEligibility, com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.a payerDetailsContentProvider, com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.b sendToPayerDelegate) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(sendToPayerEligibility, "sendToPayerEligibility");
        Intrinsics.checkNotNullParameter(payerDetailsContentProvider, "payerDetailsContentProvider");
        Intrinsics.checkNotNullParameter(sendToPayerDelegate, "sendToPayerDelegate");
        this.f161959l = commonDataSource;
        this.f161960m = juniorDataSource;
        this.f161961n = sendToPayerEligibility;
        this.o = payerDetailsContentProvider;
        this.f161962p = sendToPayerDelegate;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        wi0.b bVarA;
        xi0.b bVarA2;
        FeatureCommand featureCommandF;
        Map map;
        AccountFieldType accountFieldType;
        String str2;
        String str3;
        if (!a10.b.B(v1.Companion, t1.SEND_TO_PAYER, str)) {
            return Boolean.FALSE;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility.SendToPayerData");
        SendToPayerEligibility$SendToPayerData sendToPayerEligibility$SendToPayerData = (SendToPayerEligibility$SendToPayerData) obj2;
        SendToPayerEligibility$State.Enabled state = sendToPayerEligibility$SendToPayerData.f92097a;
        String str4 = sendToPayerEligibility$SendToPayerData.f92098b;
        com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.b bVar = this.f161962p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        f5j.a aVar = state.f92101b;
        if (aVar != null) {
            featureCommandF = d2k.g.a(bVar.f92103a, aVar, null, null, null, null, null, null, null, 1022);
        } else {
            r1 r1Var = state.f92100a;
            Map mapG = null;
            if (r1Var == null || (str3 = r1Var.f273020b) == null) {
                bVarA = null;
            } else {
                wi0.b.Companion.getClass();
                bVarA = wi0.a.a(str3);
            }
            if (r1Var == null || (str2 = r1Var.f273019a) == null) {
                bVarA2 = null;
            } else {
                xi0.b.Companion.getClass();
                bVarA2 = xi0.a.a(str2);
            }
            if (r1Var != null && (map = r1Var.d) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str5 = (String) entry.getKey();
                    AccountFieldType[] accountFieldTypeArrValues = AccountFieldType.values();
                    int length = accountFieldTypeArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            accountFieldType = null;
                            break;
                        }
                        accountFieldType = accountFieldTypeArrValues[i];
                        if (a0.z(accountFieldType.name(), str5, true)) {
                            break;
                        }
                        i++;
                    }
                    if (accountFieldType != null) {
                        linkedHashMap.put(accountFieldType, entry.getValue());
                    }
                }
                mapG = linkedHashMap;
            }
            if (mapG == null) {
                mapG = r0.g();
            }
            featureCommandF = u0.f(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(str4, null, bVarA, bVarA2, mapG, null, null, 98)));
        }
        bVar.f92104b.c(featureCommandF);
        return Boolean.TRUE;
    }
}
