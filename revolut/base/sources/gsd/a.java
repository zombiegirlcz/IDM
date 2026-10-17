package gsd;

import akg.n;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import et6.i2;
import gim.i;
import gr6.m;
import h6e.f;
import hsd.f;
import ie6.q;
import io3.l;
import java.util.Set;
import jpl.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import w4l.h;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function3 {
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f146389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f146389w = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        a aVar = new a(this.f146389w, (Continuation) obj4);
        aVar.u = zBooleanValue;
        aVar.v = zBooleanValue2;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVarV;
        n nVarV2;
        char c2;
        Flow flowI;
        boolean z = this.u;
        boolean z3 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.f146389w;
        jsd.a aVar2 = (jsd.a) cVar.f146392b;
        twg.c cVar2 = aVar2.f178171c;
        Set setB = y0.b(l.CURRENT);
        AccountId.Personal personal = AccountId.Personal.f51414a;
        n nVarV3 = nim.a.v(cVar2.K(personal, setB), new e(aVar2, 18));
        g gVar = g.f186406a;
        n nVarV4 = nim.a.v(rd0.e.b(nim.a.w(pd.b.r(kli.a.h(rd0.e.c(nVarV3, gVar), osg.b.d(aVar2.f178169a)), new jlh.g(aVar2, 16)), new e(aVar2, 16))), new e(17));
        final int i = 0;
        if (z) {
            f fVar = (f) cVar.f146393c;
            nVarV = nim.a.v(xam.a.h(new hsd.e(fVar, null), fVar.f155035a.i(false)), new hqk.a(7));
        } else {
            nVarV = null;
        }
        final int i2 = 1;
        h hVar = h.f294642c;
        if (z3) {
            final a5h.g gVar2 = (a5h.g) cVar.d;
            twg.c cVar3 = (twg.c) gVar2.f;
            nVarV2 = nim.a.v(rd0.e.b(nim.a.w(pd.b.r(kli.a.h(rd0.e.c(nim.a.v(new t38.e(((i2) ((m) cVar3.f275019c)).c(hVar), 24, ((wa7.m) cVar3.d).k(), new d(3, 0, null)), new Function1() { // from class: msd.a
                /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[LOOP:1: B:35:0x00d6->B:37:0x00dc, LOOP_END] */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r12) {
                    /*
                        Method dump skipped, instruction units count: 272
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: msd.a.invoke(java.lang.Object):java.lang.Object");
                }
            }), gVar), osg.b.d((wsg.n) gVar2.d)), new Function1() { // from class: msd.a
                /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[LOOP:1: B:35:0x00d6->B:37:0x00dc, LOOP_END] */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r12) {
                    /*
                        Method dump skipped, instruction units count: 272
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: msd.a.invoke(java.lang.Object):java.lang.Object");
                }
            }), new msb.c(gVar2, 3))), new msb.c(4));
        } else {
            nVarV2 = null;
        }
        ksd.g gVar3 = (ksd.g) cVar.e;
        Flow flowB = gVar3.b(f.c.f149638a);
        Flow flowB2 = gVar3.b(f.b.f149637a);
        Flow flowB3 = gVar3.b(f.e.f149640a);
        if (((j48.c) gVar3.f189433h).c()) {
            flowI = gVar3.b(f.d.f149639a);
            c2 = 3;
        } else {
            c2 = 3;
            flowI = zi0.c.i(new lsd.c(r0.g(), f0.f322471a));
        }
        n nVarV5 = nim.a.v(nim.a.v(nim.a.u(new q(2, 15, null), u0.i(u0.i(flowB, flowB2, flowB3), u0.i(flowI, gVar3.b(f.C0861f.f149641a), gVar3.b(f.g.f149642a)), u0.m(nim.a.A(rd0.e.b(pd.b.r(ue0.e.E(rd0.e.c(nim.a.A(nim.a.v(gVar3.f189429a.f(hVar), new kpj.a(27)), new kpj.a(28)), gVar), new Data(uc3.e.TERMINATED, null, false, 6, null)), new ksd.b(gVar3, 2))), new kpj.a(25)), nim.a.A(xam.a.h(new ksd.f(gVar3, null, 0), nim.a.v(u0.i(gVar3.f189432g.c(hVar), rd0.e.b(gVar3.d.J(personal, hVar)), new ahe.l(gVar3.k.k(), 9)), new kpj.a(23))), new kpj.a(24))))), new ksd.b(gVar3, 0)), new ksd.b(gVar3, 1));
        Flow[] elements = new Flow[4];
        elements[0] = nVarV4;
        elements[1] = nVarV;
        elements[2] = nVarV2;
        elements[c2] = nVarV5;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
