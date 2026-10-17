package hml;

import com.revolut.sso.api.models.ConsentChallenge;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import wli.x;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge.Qr.Delegated.Details.Action f153993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.sso.impl.ui.consent.qr.b bVar, ConsentChallenge.Qr.Delegated.Details.Action action, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f153993w = action;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f153993w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ConsentChallenge.Qr.Delegated.Details.Action action = this.f153993w;
        com.revolut.sso.impl.ui.consent.qr.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            x xVar = bVar.u;
            String str = action.f105919b;
            lg0.a aVar2 = lg0.a.OPEN_BROWSER;
            this.u = 1;
            obj2 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            oki.h.D2(bVar.v);
        } else {
            Regex regex = d0m.b.f110450a;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Cannot process QR-code deeplink. Invalid deep link: ", d0m.b.a(action.f105919b)));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
