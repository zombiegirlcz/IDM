package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ APMConfirmationPayload.IdealConfirmation f261526w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, APMConfirmationPayload.IdealConfirmation idealConfirmation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f261526w = idealConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f261526w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        ad2.a aVar2 = this.v.f261538l;
        APMConfirmationPayload.IdealConfirmation idealConfirmation = this.f261526w;
        String str = idealConfirmation.f82727a;
        String str2 = idealConfirmation.f82728b;
        this.u = 1;
        bd2.e eVar = (bd2.e) aVar2;
        eVar.getClass();
        bd2.d dVar = new bd2.d(eVar, str, str2, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, dVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
