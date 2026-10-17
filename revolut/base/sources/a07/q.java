package a07;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import ds6.z;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FreelancerTaxProfile f158b;

    public /* synthetic */ q(FreelancerTaxProfile freelancerTaxProfile, int i) {
        this.f157a = i;
        this.f158b = freelancerTaxProfile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157a) {
            case 0:
                return f.a((f) obj2, this.f158b, null, 239);
            default:
                od0.h hVar = od0.i.Companion;
                z zVar = new z((TaxHubVatSummary) obj2, this.f158b);
                hVar.getClass();
                return od0.h.a(zVar);
        }
    }
}
