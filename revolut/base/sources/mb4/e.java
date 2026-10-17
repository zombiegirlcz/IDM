package mb4;

import ft3.h1;
import gim.i;
import j34.g;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a f204126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f204127x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar, File file, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204126w = aVar;
        this.f204127x = file;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f204126w, this.f204127x, continuation, 0);
            default:
                return new e(this.f204126w, this.f204127x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        File file = this.f204127x;
        com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar = this.f204126w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    sb4.c cVar = aVar.f67701q;
                    ry3.a aVar2 = new ry3.a(file);
                    this.v = 1;
                    hx3.a aVar3 = cVar.f261499a;
                    h1 h1VarC = cVar.c();
                    g gVar = ((hx3.g) aVar3).f156379a;
                    gVar.getClass();
                    j34.a aVar4 = new j34.a(gVar, h1VarC, aVar2, null, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar4, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    e eVar = new e(aVar, file, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, eVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.D2(aVar.f67703s);
                return Unit.f186387a;
        }
    }
}
