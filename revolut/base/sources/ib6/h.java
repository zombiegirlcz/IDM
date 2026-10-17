package ib6;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SpareChangeScreen spareChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = spareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = (n) this.v.T.getValue();
        Object obj3 = suggestion.f53496h;
        if (obj3 instanceof Float) {
            nVar.H2(nVar.f160105q, new j(obj3, 0));
        } else {
            nVar.getClass();
        }
        return Unit.f186387a;
    }
}
