package e42;

import boe.k;
import do3.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b f122378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f122379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f122378w = bVar;
                this.f122379x = (i) function1;
                super(1, continuation);
                break;
            default:
                this.f122378w = bVar;
                this.f122379x = (i) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f122378w, this.f122379x, continuation, 0);
            default:
                return new f(this.f122378w, this.f122379x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar = new k(1, null, this.f122379x);
                this.v = 1;
                Object objT = q.t(this.f122378w, kVar, this);
                return objT == aVar ? aVar : objT;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar = this.f122378w;
                f fVar = new f(bVar, this.f122379x, null, 0);
                this.v = 1;
                Object objP2 = bVar.p2(this, fVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
