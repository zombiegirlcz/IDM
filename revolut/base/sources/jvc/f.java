package jvc;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SecurityHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SecurityHubScreen securityHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = securityHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarE3 = this.v.R2();
        Intrinsics.h(action);
        com.revolut.feature.security_hub.impl.ui.security_hub.c cVar = (com.revolut.feature.security_hub.impl.ui.security_hub.c) a0VarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        String str = action.f58316a;
        switch (str.hashCode()) {
            case -1282361203:
                if (str.equals("HEADER_DEVICE_ACTION_ID")) {
                    cVar.C2(l.f178839a);
                }
                break;
            case -602955664:
                if (str.equals("HEADER_REPORT_FRAUD_ACTION_ID")) {
                    til.m mVar = cVar.G;
                    Map mapX = a0.d.x(ib.b.Flow, "SECURITY_HUB_FRAUD_REPORTING");
                    AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                    k9 k9Var = k9.SecurityHub;
                    companion.getClass();
                    cVar.C1(til.m.c(mVar, new WorkflowConfiguration.CreateWorkflow(mapX, AnalyticsProduct.Companion.b(k9Var), 46)));
                }
                break;
            case 958607524:
                if (str.equals("HEADER_LOST_DEVICE_ACTION_ID")) {
                    List list = ((i) ((j2) cVar.K.f22677a).getValue()).f;
                    Continuation continuation = null;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!((UserDevice) obj3).f71921m) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (ue0.e.n(arrayList)) {
                        cVar.f85647t.getClass();
                        y0 y0Var = new y0("NO_OTHER_DEVICE_PRESENT_DIALOG_ID", new l0(new TextLocalisedClause(R$string.security_hub_lost_device_no_other_logins_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_lost_device_no_other_logins_description, null, null, 14), null, new TextLocalisedClause(R$string.security_hub_lost_device_no_other_logins_action, null, null, 14), null, null, false, null, 1012), false, 4);
                        yji.l.b1(cVar, cVar.X1(y0Var), null, new jv.o(cVar, y0Var, continuation, 2), 3);
                    } else {
                        cVar.C2(r.f178845a);
                    }
                }
                break;
            case 1541848862:
                if (str.equals("HEADER_LOST_CARD_ACTION_ID")) {
                    cVar.K2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
