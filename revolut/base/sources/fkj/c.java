package fkj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mii.k;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanGetPortOutCredentialsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimMobilePlanGetPortOutCredentialsScreen esimMobilePlanGetPortOutCredentialsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanGetPortOutCredentialsScreen;
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

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.W.getValue();
        Object obj3 = model.u;
        if (obj3 instanceof String) {
            fVar.f135850p.c(null, (String) obj3, true, new fk8.a(18));
            fVar.X1(new k("ID_COPY_TO_CLIPBOARD_SHOT", new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_copied_title, null, null, 14), null, null, null, 28));
        } else {
            fVar.getClass();
        }
        return Unit.f186387a;
    }
}
