package chj;

import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.j1;
import dej.r1;
import java.time.Instant;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c0 extends yji.n {
    public abstract void Z2(String str, String str2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, EsimContractMetadata esimContractMetadata, l71.d dVar);

    public abstract void b3(dej.k kVar, EsimDataPlan esimDataPlan);

    public abstract void c3(Instant instant, String str, String str2, boolean z, r1 r1Var, dj0.d dVar, EsimContractMetadata esimContractMetadata, dej.e eVar, String str3);

    public abstract Flow d3();

    public abstract void e3(String str, r1 r1Var, String str2, String str3, EsimDataPlanOfferInfo esimDataPlanOfferInfo, dej.m mVar, boolean z, j1 j1Var, Boolean bool, dj0.d dVar, EsimContractMetadata esimContractMetadata, l71.d dVar2, String str4, dej.c cVar, EsimGiftRecipient esimGiftRecipient);

    public abstract void f3(String str, r1 r1Var, dj0.d dVar, j1 j1Var, Boolean bool, EsimContractMetadata esimContractMetadata, String str2);
}
