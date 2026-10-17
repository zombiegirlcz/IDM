package wnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f298780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Continuation continuation, g0 g0Var) {
        super(2, continuation);
        this.u = i;
        this.f298780w = g0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(0, continuation, this.f298780w);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(1, continuation, this.f298780w);
                c0Var2.v = obj2;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(2, continuation, this.f298780w);
                c0Var3.v = obj2;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0(3, continuation, this.f298780w);
                c0Var4.v = obj2;
                return c0Var4;
            default:
                c0 c0Var5 = new c0(4, continuation, this.f298780w);
                c0Var5.v = obj2;
                return c0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Template template;
        int i = this.u;
        g0 g0Var = this.f298780w;
        switch (i) {
            case 0:
                Template template2 = (Template) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new kmc.e(template2, 2));
                g0Var.f298794x.e3(new doc.c(template2.f95706a));
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new d0((Template) pair.f186385a, (Data) pair.f186386b));
                return Unit.f186387a;
            case 2:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair2.f186385a;
                Template template3 = (Template) pair2.f186386b;
                if (template3 == null) {
                    l lVar = (l) data.getContent();
                    if (lVar instanceof i) {
                        template = ((i) lVar).f298798b;
                    } else if (lVar instanceof k) {
                        template = ((k) lVar).f298804b;
                    } else if (lVar instanceof j) {
                        template = ((j) lVar).f298802c;
                    } else {
                        if (lVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        template = null;
                    }
                } else {
                    template = template3;
                }
                g0Var.x2(new d0(data, template));
                if (template3 == null && template != null) {
                    j2 j2Var = g0Var.B;
                    j2Var.getClass();
                    j2Var.g(null, template);
                }
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new wgd.k(data2, 17));
                return Unit.f186387a;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new wgd.k(data3, 18));
                return Unit.f186387a;
        }
    }
}
