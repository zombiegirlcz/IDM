package cxi;

import cli.y;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreen;
import cw7.j;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungePassCheckoutEntriesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungePassCheckoutEntriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungePassCheckoutEntriesScreen airportLoungePassCheckoutEntriesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) airportLoungePassCheckoutEntriesScreen.Q.getValue();
                hVar.C2(new f(Math.max(((d) ((j2) hVar.o.f22677a).getValue()).f109986a, 1)));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) airportLoungePassCheckoutEntriesScreen.Q.getValue();
                hVar2.H2(hVar2.o, new j(13));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar3 = (h) airportLoungePassCheckoutEntriesScreen.Q.getValue();
                y yVar = hVar3.o;
                hVar3.H2(yVar, new a5g.i(Math.max(((d) ((j2) yVar.f22677a).getValue()).f109986a - 1, 1), 10));
                break;
        }
        return Unit.f186387a;
    }
}
