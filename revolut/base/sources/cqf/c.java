package cqf;

import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AdditionalInformationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AdditionalInformationScreen additionalInformationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = additionalInformationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdditionalInformationScreen additionalInformationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                additionalInformationScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) additionalInformationScreen.f92184a0.getValue();
                hVar.v2(new fpf.b(a0.d.x(hVar.f108096p.f92155a, ((e) hVar.t2()).f108091b)));
                break;
        }
        return Unit.f186387a;
    }
}
