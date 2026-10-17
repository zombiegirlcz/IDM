package yz2;

import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yz2.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChangePinActivationScreen f318023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ChangePinActivationScreen changePinActivationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318023w = changePinActivationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f318023w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f318023w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChangePinActivationScreen changePinActivationScreen = this.f318023w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) changePinActivationScreen.V.getValue();
                Intrinsics.h(id10);
                h hVar = (h) fVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_FAQ")) {
                    hVar.v2(e.a.f318025a);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) changePinActivationScreen.V.getValue();
                Intrinsics.h(clickData);
                h hVar2 = (h) fVar2;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ID_LEARN_MORE")) {
                    hVar2.v2(e.b.f318026a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
