package h3a;

import com.revolut.feature.alipay.api.AlipayApi$Toggles$AlipayPlus;
import com.revolut.feature.masav.api.MasavApi$Toggles$MasavDirectDebits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements oim.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f149066a;

    public /* synthetic */ q(t tVar) {
        this.f149066a = tVar;
    }

    @Override // oim.s
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Boolean groupsEnabled = (Boolean) obj2;
        Boolean pushToCardEnabled = (Boolean) obj3;
        Boolean cryptoEnabled = (Boolean) obj4;
        Boolean donationsEnabled = (Boolean) obj5;
        Boolean paymentLinksEnabled = (Boolean) obj6;
        m3a.b featuresAvailability = (m3a.b) obj7;
        r toggledFeaturesAvailability = (r) obj8;
        uw1.g apmConfig = (uw1.g) obj9;
        vo1.d billsTaxesConfig = (vo1.d) obj10;
        Intrinsics.checkNotNullParameter(groupsEnabled, "groupsEnabled");
        Intrinsics.checkNotNullParameter(pushToCardEnabled, "pushToCardEnabled");
        Intrinsics.checkNotNullParameter(cryptoEnabled, "cryptoEnabled");
        Intrinsics.checkNotNullParameter(donationsEnabled, "donationsEnabled");
        Intrinsics.checkNotNullParameter(paymentLinksEnabled, "paymentLinksEnabled");
        Intrinsics.checkNotNullParameter(featuresAvailability, "featuresAvailability");
        Intrinsics.checkNotNullParameter(toggledFeaturesAvailability, "toggledFeaturesAvailability");
        Intrinsics.checkNotNullParameter(apmConfig, "apmConfig");
        Intrinsics.checkNotNullParameter(billsTaxesConfig, "billsTaxesConfig");
        boolean zBooleanValue = cryptoEnabled.booleanValue();
        boolean zBooleanValue2 = pushToCardEnabled.booleanValue();
        boolean zBooleanValue3 = donationsEnabled.booleanValue();
        boolean z = featuresAvailability.f202307b;
        boolean z3 = featuresAvailability.f202306a;
        boolean zBooleanValue4 = groupsEnabled.booleanValue();
        boolean z4 = toggledFeaturesAvailability.f149067a;
        boolean zBooleanValue5 = paymentLinksEnabled.booleanValue();
        boolean z6 = featuresAvailability.f202308c;
        t tVar = this.f149066a;
        boolean zA = tVar.i.a();
        jte.d dVar = (jte.d) tVar.f149072g;
        return new m3a.c(z3, z, zBooleanValue4, zBooleanValue2, zBooleanValue, zBooleanValue3, z4, zBooleanValue5, billsTaxesConfig, apmConfig, z6, zA, dVar.c(MasavApi$Toggles$MasavDirectDebits.f78088c), tVar.f149074j.a(), dVar.c(AlipayApi$Toggles$AlipayPlus.f61059c));
    }
}
