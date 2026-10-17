package x44;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import efm.d0;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import os9.t;
import p24.p;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = this.v;
        PluginFlowContract$Input pluginFlowContract$Input = cVar.f302789a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        lw3.a aVar2 = cVar.f302790b;
        h1 productPayload = w0.F(pluginFlowContract$Input.getF67796a());
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p pVar = aVar2.f200404a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        d0<xz3.d> agreementsDocuments = pVar.f232057c.getAgreementsDocuments(productPayload.f137835a, "agreement");
        p24.b bVar = new p24.b(9, new t(productPayload, pVar, 18));
        agreementsDocuments.getClass();
        ufm.i iVar = new ufm.i(agreementsDocuments, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(w.H0(w.i0(iVar), cVar.f302791c.b(ju3.a.DOCUMENTS_AGREEMENTS, w0.F(pluginFlowContract$Input.getF67796a()).f137836b.f137810a)), new x0i.i(new x29.a(14), 17), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        this.u = 1;
        Object objB = nim.a.b(iVar2, this);
        return objB == aVar ? aVar : objB;
    }
}
