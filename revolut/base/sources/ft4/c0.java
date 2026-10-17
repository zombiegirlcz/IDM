package ft4;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f137899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(i0 i0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137899w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f137899w, continuation, 0);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.f137899w, continuation, 1);
                c0Var2.v = obj2;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(this.f137899w, continuation, 2);
                c0Var3.v = obj2;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0(this.f137899w, continuation, 3);
                c0Var4.v = obj2;
                return c0Var4;
            default:
                c0 c0Var5 = new c0(this.f137899w, continuation, 4);
                c0Var5.v = obj2;
                return c0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c0) create((ql4.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c0) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 23;
        i0 i0Var = this.f137899w;
        int i3 = 0;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.v, new fk4.o(data, 23));
                return Unit.f186387a;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.v, new f9g.l(str, 21));
                return Unit.f186387a;
            case 2:
                ql4.e eVar = (ql4.e) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (eVar.f247117c.isEmpty()) {
                    return new go.g(zi0.c.P(new j(eVar.f247116b), false, null, 3), 2);
                }
                Set setI1 = zhm.d0.i1(eVar.f247117c);
                io3.l lVar = io3.l.CREDIT;
                i0 i0Var2 = this.f137899w;
                return nim.a.v(rd0.e.b(whf.b.a(i0Var2.f137910p, rd0.e.c(new ard.c0(vkm.q.q(new f0(t1.g(i0Var2.u, 300L), i3)), setI1, lVar, i0Var2, 10), kotlin.coroutines.g.f186406a), null, null, null, 14)), new fpk.b(i0Var2, eVar, 6));
            case 3:
                wi0.b bVar = (wi0.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((om4.c0) i0Var.f137912r).a(bVar, w4l.i.f294643c);
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!iVar.d()) {
                    return new go.g(new Data(z.f137934a, null, false, 6, null), 2);
                }
                ql4.a aVar6 = (ql4.a) iVar.c();
                Set setI12 = zhm.d0.i1(aVar6.f247083c);
                io3.l lVar2 = io3.l.CURRENT;
                i0 i0Var3 = this.f137899w;
                return nim.a.v(rd0.e.b(whf.b.a(i0Var3.f137910p, rd0.e.c(new ard.c0(vkm.q.q(new f0(t1.g(i0Var3.u, 300L), i3)), setI12, lVar2, i0Var3, 10), kotlin.coroutines.g.f186406a), null, null, null, 14)), new eed.i(aVar6, i2, i0Var3, iVar));
        }
    }
}
