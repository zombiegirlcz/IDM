package a03;

import a03.d;
import com.revolut.feature.card_management.impl.ui.change_pin.information.ChangePinInformationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChangePinInformationScreen f116w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ChangePinInformationScreen changePinInformationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116w = changePinInformationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f116w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f116w, continuation, 1);
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
        ChangePinInformationScreen changePinInformationScreen = this.f116w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) changePinInformationScreen.V.getValue();
                Intrinsics.h(id10);
                g gVar = (g) eVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_FAQ")) {
                    gVar.v2(d.a.f117a);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar2 = (e) changePinInformationScreen.V.getValue();
                Intrinsics.h(clickData);
                g gVar2 = (g) eVar2;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ID_LEARN_MORE")) {
                    gVar2.v2(d.c.f119a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
