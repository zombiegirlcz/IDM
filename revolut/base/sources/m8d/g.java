package m8d;

import aj0.k0;
import aj0.l0;
import aj0.m0;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PigeonContentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PigeonContentScreen pigeonContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pigeonContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PigeonContentScreen pigeonContentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h0) pigeonContentScreen.T2()).u2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = (h0) pigeonContentScreen.T2();
                m0 m0Var = (m0) ((m) h0Var.t2()).f203514c.getContent();
                l0 l0Var = m0Var != null ? m0Var.d : null;
                k0 k0Var = l0Var instanceof k0 ? (k0) l0Var : null;
                if (k0Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("CTA must be visible only for 'instructional' content type");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                } else {
                    aj0.g gVar = k0Var.f5362b;
                    if (gVar == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("CTA must be visible only when 'instructional' content has 'action' object");
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                    } else {
                        h0Var.n2(new e0(h0Var, gVar, null, 1), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
