package a54;

import a26.j;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$State;
import ft3.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p24.p;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zhm.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a f1323w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1323w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f1323w, continuation, 0);
            case 1:
                return new h(this.f1323w, continuation, 1);
            default:
                return new h(this.f1323w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a aVar = this.f1323w;
        int i2 = 2;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    h hVar = new h(aVar, continuation, i2);
                    this.v = 1;
                    if (aVar.p2(this, hVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lw3.b bVar = aVar.f67017q;
                h1 h1VarA9 = aVar.f67016p.a9();
                Map map = ((CreditAgreementsV2FlowContract$State) ((j2) aVar.f67020t.f22677a).getValue()).f67012b;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = map.entrySet().iterator();
                while (it8.hasNext()) {
                    a0.x((Iterable) ((Map.Entry) it8.next()).getValue(), arrayList);
                }
                this.v = 1;
                p pVar = bVar.f200405a;
                pVar.getClass();
                of6.d dVar = new of6.d(pVar, h1VarA9, arrayList, (Continuation) null, 12);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, dVar, this);
                return objJ == aVar3 ? aVar3 : objJ;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    sp3.a aVar5 = aVar.f67018r;
                    bs3.i iVar = new bs3.i("agreement-signing", bs3.g.INCOGNIA);
                    this.v = 1;
                    if (((qq3.g) aVar5).a(iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        aVar.H2(aVar.f67020t, new j((List) obj2, 3));
                        com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a.P2(aVar);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                lw3.b bVar2 = aVar.f67017q;
                h1 h1VarA92 = aVar.f67016p.a9();
                this.v = 2;
                p pVar2 = bVar2.f200405a;
                pVar2.getClass();
                p24.g gVar = new p24.g(pVar2, h1VarA92, continuation, i2);
                p0 p0Var2 = p0.f264001a;
                obj2 = e0.J(elm.f.f127540b, gVar, this);
                if (obj2 == aVar4) {
                    return aVar4;
                }
                aVar.H2(aVar.f67020t, new j((List) obj2, 3));
                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a.P2(aVar);
                return Unit.f186387a;
        }
    }
}
