package mlj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData;
import dej.u0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends oki.h implements dli.b {
    public final EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd.k f206989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd.l f206990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f206991r;

    public j(n stateMapper, EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData inputData, nd.k phoneNumberPortingAttributesValidator, olj.a phoneNumberPortingUserInputMasker, nd.l powerOfAttorneyRequestMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberPortingAttributesValidator, "phoneNumberPortingAttributesValidator");
        Intrinsics.checkNotNullParameter(phoneNumberPortingUserInputMasker, "phoneNumberPortingUserInputMasker");
        Intrinsics.checkNotNullParameter(powerOfAttorneyRequestMapper, "powerOfAttorneyRequestMapper");
        this.o = inputData;
        this.f206989p = phoneNumberPortingAttributesValidator;
        this.f206990q = powerOfAttorneyRequestMapper;
        List list = inputData.f101339b;
        ArrayList<EsimPhoneNumberPortingAttribute> arrayList = new ArrayList();
        for (Object obj2 : list) {
            u0 u0Var = ((EsimPhoneNumberPortingAttribute) obj2).e;
            if (u0Var == u0.TEXT || u0Var == u0.NUMBER) {
                arrayList.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute : arrayList) {
            String str = esimPhoneNumberPortingAttribute.f100338a;
            m70.a.c(t0.f186434a);
            linkedHashMap.put(str, new i("", esimPhoneNumberPortingAttribute.f, esimPhoneNumberPortingAttribute.f100341g, false));
        }
        this.f206991r = mra.d.b(this, new e(linkedHashMap), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f206991r;
    }
}
