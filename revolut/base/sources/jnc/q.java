package jnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import fnc.z;
import jlc.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.ui.screen.projection.a f176705w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.robo.impl.ui.screen.projection.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176705w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f176705w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f176705w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(this.f176705w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(this.f176705w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q(this.f176705w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
            default:
                q qVar6 = new q(this.f176705w, continuation, 5);
                qVar6.v = obj2;
                return qVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.robo.impl.ui.screen.projection.a aVar = this.f176705w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f85191x, new jkh.h(data, 3));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f85191x, new jkh.h(data2, 4));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f85191x, new jkh.h(data3, 5));
                break;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Template template = (Template) pair.f186385a;
                alc.n nVar = (alc.n) pair.f186386b;
                aVar.f85188s.e3(new jlc.m(template.f95706a, nVar.f6215n, nVar.f6213l, nVar.f6214m));
                break;
            case 4:
                r rVar = (r) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f85191x, new z(rVar, 1));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f85191x, new jkh.h(data4, 6));
                break;
        }
        return Unit.f186387a;
    }
}
