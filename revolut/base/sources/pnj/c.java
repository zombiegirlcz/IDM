package pnj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.terms.EsimTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimTermsScreen esimTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.f101477b0.getValue();
        Intrinsics.h(model);
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            String str2 = model.f53228a;
            if (Intrinsics.f(str2, "ID_REVOLUT_TERMS_ITEM") || Intrinsics.f(str2, "ID_PARTNER_TERMS_ITEM")) {
                hVar.A1(new g(hVar, str, null), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
