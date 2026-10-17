package ep2;

import cli.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.review_joint.a f128072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128072w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f128072w, continuation, 0);
            case 1:
                return new k(this.f128072w, continuation, 1);
            default:
                return new k(this.f128072w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar = this.f128072w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    j jVar = new j(aVar, continuation, 0);
                    this.v = 1;
                    if (u0.b0(aVar.X(), "ACCEPT_BUTTON_LOADING_TAG", jVar, this) == aVar2) {
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
                y yVar = aVar.f63982r;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        bp2.d dVar = aVar.o;
                        String str = ((f) ((j2) yVar.f22677a).getValue()).f128067a;
                        this.v = 1;
                        pn2.d dVar2 = dVar.f17546a;
                        dVar2.getClass();
                        pn2.b bVar = new pn2.b(dVar2, str, continuation, 3);
                        p0 p0Var = p0.f264001a;
                        obj2 = e0.J(elm.f.f127540b, bVar, this);
                        if (obj2 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    aVar.H2(yVar, new ei8.d((gp2.a) obj2, 26));
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    aVar.H2(yVar, new d22.f(2, e));
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    j jVar2 = new j(aVar, continuation, i2);
                    this.v = 1;
                    if (u0.b0(aVar.X(), "REJECT_BUTTON_LOADING_TAG", jVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
