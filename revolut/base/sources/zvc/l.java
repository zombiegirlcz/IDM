package zvc;

import cuc.d0;
import cuc.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import wtc.g0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a f325654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f325655x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f325654w = aVar;
        this.f325655x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f325654w, this.f325655x, continuation, 0);
            default:
                return new l(this.f325654w, this.f325655x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f325655x;
        com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar = this.f325654w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    g0 g0Var = aVar.o;
                    this.v = 1;
                    e0 e0Var = g0Var.f299869a;
                    e0Var.getClass();
                    d0 d0Var = new d0(e0Var, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, d0Var, this);
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    l lVar = new l(aVar, str, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, lVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
