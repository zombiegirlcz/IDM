package q64;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dx4.z2;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GiveConsentScreen f242483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GiveConsentScreen giveConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242483w = giveConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f242483w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f242483w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f242483w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            default:
                j jVar4 = new j(this.f242483w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((z2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GiveConsentScreen giveConsentScreen = this.f242483w;
        switch (i) {
            case 0:
                String questionId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                p54.g.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = p54.b.f233004b;
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                bVar.C1(new BridgeDestination(new ActivityNavigateCommand(explicitActivityDestination, new CreditBackendFlowContract$Configuration((p54.c) null, new BackendFlowContract$Configuration(22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), "CREDIT_MANAGE_CO_BORROWER_DETAILS_FLOW"), new ManageCoBorrowerDetailsParcel(questionId), CreditApplicationPluginFlowContract$Configuration.a(bVar.o.getF68490b(), "CREDIT_MANAGE_CO_BORROWER_DETAILS_FLOW"), false, 35), null, 10, 0, null, null, null, null, false, 1012)));
                break;
            case 1:
                z2 infoPopup = (z2) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(infoPopup, "infoPopup");
                bVar2.J2(infoPopup);
                break;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = giveConsentScreen.d();
                String url2 = aVar3.f275445a;
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) nVarE3;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                bVar3.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, true, true, true, 65438))));
                break;
            default:
                yx4.b click = (yx4.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) giveConsentScreen.d();
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                Object obj3 = click.f317545b;
                if (obj3 instanceof iu3.k) {
                    z2 z2Var = ((iu3.k) obj3).d;
                    if (z2Var != null) {
                        bVar4.J2(z2Var);
                    }
                } else if (obj3 instanceof z2) {
                    bVar4.J2((z2) obj3);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "GiveConsentScreenModel", v0.a.h(obj3, "Click event for ", " was not handled"), null, null, 16);
                }
                break;
        }
        return Unit.f186387a;
    }
}
