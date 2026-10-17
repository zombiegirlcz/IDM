package ri4;

import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GiveConsentScreen f254537w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GiveConsentScreen giveConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254537w = giveConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f254537w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f254537w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GiveConsentScreen giveConsentScreen = this.f254537w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarH3 = giveConsentScreen.h3();
                String link = aVar.f275445a;
                n nVar = (n) iVarH3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                if (Intrinsics.f(link, "revolut://app/credit/credit-registers")) {
                    nVar.C1(new BridgeDestination(nVar.f254550r.b()));
                } else {
                    nVar.C1(new ExternalDestination.Browser(link, null));
                }
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                KProperty[] kPropertyArr = GiveConsentScreen.f68473d0;
                TwinVerticalButton twinVerticalButtonI3 = giveConsentScreen.i3();
                boolean z = !zBooleanValue;
                twinVerticalButtonI3.setSecondaryButtonVisible(z);
                twinVerticalButtonI3.setSecondaryButtonEnabled(z);
                twinVerticalButtonI3.setMainButtonEnabled(z);
                break;
        }
        return Unit.f186387a;
    }
}
