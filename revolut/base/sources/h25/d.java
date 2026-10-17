package h25;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.prompt.CreditPromptInputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import ft3.d1;
import g84.u;
import gim.i;
import grl.r2;
import ht3.f;
import ht3.h;
import ht3.l;
import ht3.m;
import ht3.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ou3.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f148702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d1 f148703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r2 f148704y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, o oVar, d1 d1Var, r2 r2Var, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f148702w = oVar;
        this.f148703x = d1Var;
        this.f148704y = r2Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f148702w, this.f148703x, this.f148704y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objY2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            u uVar = new u(eVar, this.f148703x, this.f148704y, null, 13);
            this.u = 1;
            objY2 = eVar.Y2(this, uVar);
            if (objY2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objY2 = obj2;
        }
        o oVar = this.f148702w;
        String str = oVar.f229807a;
        String str2 = oVar.f229808b;
        m mVar = n.Companion;
        String url2 = oVar.f229809c;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        ht3.o oVar2 = new ht3.o(str, str2, null, null, new n(l.MEDIA_CONTENT, null, url2, f.IMAGE, false), null, null, new ht3.c(oVar.d, h.f155276a, ht3.b.ACCENT), null, false, null, 1644);
        CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration = new CreditPromptAnalyticsConfiguration(R$string.application_dashboard_prompt_title, R$string.application_dashboard_prompt_description, R$string.application_dashboard_prompt_button, 0, 8);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R((PluginPayload) objY2, "");
        Intrinsics.checkNotNullParameter(creditApplicationPluginFlowContract$ConfigurationR, "<this>");
        r2 r2Var = creditApplicationPluginFlowContract$ConfigurationR.f66893c;
        gt3.f fVar = creditApplicationPluginFlowContract$ConfigurationR.e;
        ks3.b bVar = creditApplicationPluginFlowContract$ConfigurationR.f66894g;
        ks3.c cVar = creditApplicationPluginFlowContract$ConfigurationR.f66895h;
        String str3 = creditApplicationPluginFlowContract$ConfigurationR.f66892b;
        boolean z = creditApplicationPluginFlowContract$ConfigurationR.i;
        CreditApplicationCommonContext creditApplicationCommonContextA = zr3.b.a(creditApplicationPluginFlowContract$ConfigurationR.f, r2Var, str3, creditApplicationPluginFlowContract$ConfigurationR.d, fVar, bVar, cVar, creditApplicationPluginFlowContract$ConfigurationR.f66899n, z);
        companion.getClass();
        yji.n.P2(eVar, eVar.o2(new rv3.a(new CreditPromptInputData(null, oVar2, creditPromptAnalyticsConfiguration, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextA)), 1))), ModalDestination.Style.POPUP.f98311a, null, 2);
        return Unit.f186387a;
    }
}
