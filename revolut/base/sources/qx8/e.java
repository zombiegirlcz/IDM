package qx8;

import com.revolut.core.ui_kit.views.WebView;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreen;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WebIdPortalScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(WebIdPortalScreen webIdPortalScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = webIdPortalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WebIdPortalScreen webIdPortalScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.kyc.impl.web_id.web_id_portal.a) webIdPortalScreen.d()).u, WebIdPortalScreenContract$ModalStep.CloseVideoCall.f77894a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.kyc.impl.web_id.web_id_portal.a aVar3 = (com.revolut.feature.kyc.impl.web_id.web_id_portal.a) webIdPortalScreen.d();
                y80.a aVar4 = aVar3.o;
                if (!aVar4.c("android.permission.CAMERA") || !aVar4.c("android.permission.RECORD_AUDIO")) {
                    aii.o oVarL1 = aVar3.l1();
                    PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
                    knm.b.j(oVarL1, new com.revolut.kompot.common.c(new PermissionsFlow(r0.k(new Pair("android.permission.CAMERA", none), new Pair("android.permission.RECORD_AUDIO", none))), new p(aVar3, 0), 2));
                }
                aVar3.H2(aVar3.f77900t, new qwd.o(24));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = WebIdPortalScreen.T;
                try {
                    WebView webView = webIdPortalScreen.d3().f292848b.getWebView();
                    if (webView.isAttachedToWindow()) {
                        webView.evaluateJavascript("window.WebID.IdentCallModule.stopIdentVideo();", null);
                    }
                } catch (Throwable th10) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.ERROR, null, null, th10, null, 16);
                }
                break;
        }
        return Unit.f186387a;
    }
}
