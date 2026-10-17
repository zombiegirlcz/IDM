package ft1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bizum.impl.ui.registration.terms_old.BizumRegistrationTermsOldScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import fjd.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ BizumRegistrationTermsOldScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BizumRegistrationTermsOldScreen bizumRegistrationTermsOldScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumRegistrationTermsOldScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) ((e) this.u.Z.getValue());
        String e = ((a) mVar.t2()).f137771a.getE();
        Continuation continuation = null;
        if (a0.y(e, "pdf", true)) {
            mVar.A1(new g0(mVar, e, continuation, 15), new yi5.b(25));
        } else {
            mVar.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(e, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
        }
        return Unit.f186387a;
    }
}
