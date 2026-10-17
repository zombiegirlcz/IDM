package com.revolut.feature.revolutpay.shared.ui.add_payment_method;

import cli.y;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.a;
import elm.f;
import gdc.k;
import gdc.l;
import gim.i;
import k7c.t;
import k7c.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import q7c.g;
import skm.e0;
import skm.p0;
import u6c.j;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object lVar;
        c cVar = this.v;
        y yVar = cVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            g gVar = cVar.f84710p;
            String strSubstring = ((k) ((j2) yVar.f22677a).getValue()).f143134a.substring(0, 9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            this.u = 1;
            z zVar = (z) gVar.f242814b;
            zVar.getClass();
            t tVar = new t(zVar, strSubstring, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, tVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j jVar = (j) obj2;
        if (jVar.f277564c) {
            a aVar2 = ((k) ((j2) yVar.f22677a).getValue()).d;
            l lVar2 = aVar2 instanceof l ? (l) aVar2 : null;
            String str = lVar2 != null ? lVar2.f143138a : null;
            if (str == null) {
                m70.a.c(t0.f186434a);
                str = "";
            }
            String str2 = jVar.f277563b;
            lVar = new l(str, str2 != null ? str2 : "");
        } else {
            lVar = a.C0535a.f84708a;
        }
        cVar.H2(yVar, new gbi.c(lVar, jVar, 10));
        return Unit.f186387a;
    }
}
