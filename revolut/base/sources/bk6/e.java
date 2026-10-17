package bk6;

import cli.y;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.BrazilConsentGroupParcel;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreenContract$Output;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OpenFinanceScreen f16267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(OpenFinanceScreen openFinanceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16267w = openFinanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f16267w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f16267w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        int i = this.u;
        OpenFinanceScreen openFinanceScreen = this.f16267w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = (i) openFinanceScreen.R.getValue();
                String selectedId = aiVar.f53687a;
                com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.a) iVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                h[] hVarArrValues = h.values();
                int length = hVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        hVar = hVarArrValues[i2];
                        if (!a0.z(hVar.name(), selectedId, true)) {
                            i2++;
                        }
                    } else {
                        hVar = null;
                    }
                }
                if (hVar != null) {
                    aVar2.H2(aVar2.f72658q, new bhl.g(hVar, 1));
                }
                break;
            default:
                Object obj3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.a) ((i) openFinanceScreen.R.getValue());
                y yVar = aVar4.f72658q;
                if (obj3 instanceof BrazilConsentGroupParcel) {
                    if (k.f16273a[((g) ((j2) yVar.f22677a).getValue()).f16268a.ordinal()] == 1) {
                        BrazilConsentGroupParcel brazilConsentGroupParcel = (BrazilConsentGroupParcel) obj3;
                        aVar4.C2(new OpenFinanceScreenContract$Output.ConsentsGroupClicked(brazilConsentGroupParcel.f72650a.f73116b, brazilConsentGroupParcel.f72651b));
                    }
                } else if (obj3 instanceof ThirdPartyBrazil) {
                    if (k.f16273a[((g) ((j2) yVar.f22677a).getValue()).f16268a.ordinal()] == 2) {
                        aVar4.C2(new OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked(((ThirdPartyBrazil) obj3).f73116b));
                    }
                } else if (obj3 instanceof a3) {
                    aVar4.C2(new OpenFinanceScreenContract$Output.TransactionClicked((a3) obj3));
                }
                break;
        }
        return Unit.f186387a;
    }
}
