package oa4;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$Step;
import gim.i;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ra0.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public DropOutConfig.FeedbackForm u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f223518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.f223518w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f223518w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DropOutConfig.FeedbackForm feedbackForm;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        e eVar = this.f223518w;
        if (i == 0) {
            o.b(obj2);
            DropOutConfig.FeedbackForm feedbackForm2 = eVar.o.f67618b;
            h hVar = eVar.f223520q;
            String str = feedbackForm2.f66316a;
            Map map = feedbackForm2.f66317b;
            this.u = feedbackForm2;
            this.v = 1;
            Object objC = hVar.c(str, map, this);
            if (objC == aVar) {
                return aVar;
            }
            feedbackForm = feedbackForm2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feedbackForm = this.u;
            o.b(obj2);
        }
        oki.h.t2(eVar, eVar.f223521r, new DropOutFormFlowContract$Step((UUID) obj2, feedbackForm.f66316a), false, null, false, 14);
        return Unit.f186387a;
    }
}
