package iw8;

import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreen;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IdnowVideoIdentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(IdnowVideoIdentScreen idnowVideoIdentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = idnowVideoIdentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IdnowVideoIdentScreen idnowVideoIdentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.kyc.impl.idnow.video_ident.screen.a) ((k) idnowVideoIdentScreen.M.getValue())).I2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.kyc.impl.idnow.video_ident.screen.a aVar3 = (com.revolut.feature.kyc.impl.idnow.video_ident.screen.a) ((k) idnowVideoIdentScreen.M.getValue());
                aVar3.H2(aVar3.f77800s, new iui.a(26));
                WebPortalLoadingView webPortalLoadingView = idnowVideoIdentScreen.d3().f292848b;
                webPortalLoadingView.getClass();
                Intrinsics.checkNotNullParameter("const selector = 'input[type=\"text\"], input[type=\"tel\"], input[type=\"email\"]'\nconst disableInput = input => {\n    const styleBefore = window.getComputedStyle(input)\n    const colorBefore = styleBefore.color\n            const webkitColorBefore = styleBefore.webkitTextFillColor\n            input.disabled = true\n    input.style.opacity = 1\n    input.style.color = colorBefore\n    input.style.webkitTextFillColor = webkitColorBefore\n}\nconst findAndDisableInputs = root => {\n    root.querySelectorAll(selector).forEach(input => disableInput(input))\n}\nconst observer = new MutationObserver(mutations => {\n    mutations.forEach(mutation => {\n        mutation.addedNodes.forEach(node => {\n            if (node.nodeType !== 1) { return }\n            if (node.matches?.(selector)) {\n                disableInput(node)\n            }\n            findAndDisableInputs(node)\n        })\n    })\n})\nfindAndDisableInputs(document)\nobserver.observe(document.body, { childList: true, subtree: true })", "script");
                webPortalLoadingView.getWebView().evaluateJavascript("const selector = 'input[type=\"text\"], input[type=\"tel\"], input[type=\"email\"]'\nconst disableInput = input => {\n    const styleBefore = window.getComputedStyle(input)\n    const colorBefore = styleBefore.color\n            const webkitColorBefore = styleBefore.webkitTextFillColor\n            input.disabled = true\n    input.style.opacity = 1\n    input.style.color = colorBefore\n    input.style.webkitTextFillColor = webkitColorBefore\n}\nconst findAndDisableInputs = root => {\n    root.querySelectorAll(selector).forEach(input => disableInput(input))\n}\nconst observer = new MutationObserver(mutations => {\n    mutations.forEach(mutation => {\n        mutation.addedNodes.forEach(node => {\n            if (node.nodeType !== 1) { return }\n            if (node.matches?.(selector)) {\n                disableInput(node)\n            }\n            findAndDisableInputs(node)\n        })\n    })\n})\nfindAndDisableInputs(document)\nobserver.observe(document.body, { childList: true, subtree: true })", null);
                break;
        }
        return Unit.f186387a;
    }
}
