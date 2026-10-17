package sa0;

import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import ip0.t5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseFormController f261213w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BaseFormController baseFormController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261213w = baseFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f261213w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f261213w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BaseFormController baseFormController = this.f261213w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarH3 = baseFormController.h3();
                Intrinsics.h(clickData);
                k kVar = (k) aVarH3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String url2 = clickData.f275445a;
                Intrinsics.checkNotNullParameter(url2, "url");
                kVar.f261215q.Z2(url2);
                break;
            default:
                t5 t5Var = (t5) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarH32 = baseFormController.h3();
                Object obj3 = t5Var.e;
                String payload = obj3 instanceof String ? (String) obj3 : null;
                if (payload == null) {
                    payload = "";
                }
                k kVar2 = (k) aVarH32;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                kVar2.f261214p.c(null, payload, false, new s8f.h(4));
                break;
        }
        return Unit.f186387a;
    }
}
