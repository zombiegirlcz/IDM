package da8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rh8.o0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a f112484b;

    public /* synthetic */ k(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar, int i) {
        this.f112483a = i;
        this.f112484b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112483a) {
            case 0:
                OnboardingTerms onboardingTerms = (OnboardingTerms) obj2;
                Intrinsics.checkNotNullParameter(onboardingTerms, "onboardingTerms");
                od0.h hVar = od0.i.Companion;
                TextLocalisedClause textLocalisedClauseC = ((o0) this.f112484b.f76753q).c(onboardingTerms);
                hVar.getClass();
                break;
            case 1:
                AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar = this.f112484b;
                aVar.H2(aVar.v, new l(output, 0));
                break;
            default:
                bb8.g output2 = (bb8.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar2 = this.f112484b;
                aVar2.H2(aVar2.v, new d34.b(output2, 23));
                break;
        }
        return Unit.f186387a;
    }
}
