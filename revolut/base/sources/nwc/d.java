package nwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthProtectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WealthProtectionScreen wealthProtectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = wealthProtectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        qtc.k kVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        Intrinsics.h(model);
        p pVar = (p) lVarD3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -379709359:
                if (str.equals("WEALTH_PROTECTION_TRANSFERS_LIST_ID")) {
                    kVar = qtc.k.TRANSFERS;
                    Object obj3 = model.u;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj3));
                    return Unit.f186387a;
                }
                break;
            case -10518962:
                if (str.equals("WEALTH_PROTECTION_STOCKS_LIST_ID")) {
                    kVar = qtc.k.STOCKS_WITHDRAWAL;
                    Object obj32 = model.u;
                    Intrinsics.i(obj32, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj32));
                    return Unit.f186387a;
                }
                break;
            case 646815474:
                if (str.equals("WEALTH_PROTECTION_CRYPTO_LIST_ID")) {
                    kVar = qtc.k.CRYPTO_WITHDRAWAL;
                    Object obj322 = model.u;
                    Intrinsics.i(obj322, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj322));
                    return Unit.f186387a;
                }
                break;
            case 1276105222:
                if (str.equals("WEALTH_PROTECTION_POCKETS_LIST_ID")) {
                    kVar = qtc.k.POCKETS_WITHDRAWAL;
                    Object obj3222 = model.u;
                    Intrinsics.i(obj3222, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj3222));
                    return Unit.f186387a;
                }
                break;
            case 1433364485:
                if (str.equals("WEALTH_PROTECTION_CARD_PAYMENTS_LIST_ID")) {
                    kVar = qtc.k.CARD_PAYMENTS;
                    Object obj32222 = model.u;
                    Intrinsics.i(obj32222, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj32222));
                    return Unit.f186387a;
                }
                break;
            case 1845340404:
                if (str.equals("WEALTH_PROTECTION_COMMODITIES_LIST_ID")) {
                    kVar = qtc.k.COMMODITIES_WITHDRAWAL;
                    Object obj322222 = model.u;
                    Intrinsics.i(obj322222, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj322222));
                    return Unit.f186387a;
                }
                break;
            case 2015806754:
                if (str.equals("WEALTH_PROTECTION_SAVINGS_LIST_ID")) {
                    kVar = qtc.k.SAVINGS_WITHDRAWAL;
                    Object obj3222222 = model.u;
                    Intrinsics.i(obj3222222, "null cannot be cast to non-null type com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState.Visible");
                    pVar.C2(new h(kVar, (WealthProtectionFeatureState.Visible) obj3222222));
                    return Unit.f186387a;
                }
                break;
        }
        throw new IllegalArgumentException(str);
    }
}
