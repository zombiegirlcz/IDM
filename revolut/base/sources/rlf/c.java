package rlf;

import aw0.k7;
import cmf.g;
import cmf.h;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import gim.i;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function3 {
    public /* synthetic */ g u;
    public /* synthetic */ a3 v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = new c(3, (Continuation) obj4);
        cVar.u = (g) obj2;
        cVar.v = (a3) obj3;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar = this.u;
        a3 a3Var = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (gVar instanceof h) {
            return h.a((h) gVar, u5l.a.b(k.b(a3Var), null, k.o1(a3Var) ? k7.ALWAYS : k7.NEVER, new Custom(new Integer(R$attr.uikit_colorForeground), false, null, false, null, 254), 3), null, null, null, null, false, false, null, null, null, 2046);
        }
        if (gVar instanceof g.b) {
            return gVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
