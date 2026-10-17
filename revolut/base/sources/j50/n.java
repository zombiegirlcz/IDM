package j50;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mii.q;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UUID f171446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f171447x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, UUID uuid, long j2, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f171446w = uuid;
        this.f171447x = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, this.f171446w, this.f171447x, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar = (q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (qVar instanceof mii.m) {
            this.v.g3(this.f171446w, true, f0.f322471a, this.f171447x);
        }
        return Unit.f186387a;
    }
}
