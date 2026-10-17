package hwe;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d f156162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupMethod f156163x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f156164y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, TopupMethod topupMethod, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f156162w = dVar;
        this.f156163x = topupMethod;
        this.f156164y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f156162w, this.f156163x, this.f156164y, continuation, 0);
            default:
                return new w(this.f156162w, this.f156163x, this.f156164y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = this.f156162w;
                    TopupMethod topupMethod = this.f156163x;
                    String str = this.f156164y;
                    v vVar = new v(dVar, topupMethod, str, 0);
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flow.topup_methods.d.L2(dVar, topupMethod, str, vVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar2 = this.f156162w;
                    g84.u uVar = new g84.u(dVar2, this.f156163x, this.f156164y, null, 22);
                    this.v = 1;
                    if (dVar2.p2(this, uVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
