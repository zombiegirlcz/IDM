package ttl;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f274473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f274474x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(x xVar, LocalDate localDate, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f274473w = xVar;
        this.f274474x = localDate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f274473w, this.f274474x, continuation, 0);
            default:
                return new v(this.f274473w, this.f274474x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                x xVar = this.f274473w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = x.I2(xVar, this.f274474x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xVar.f274478q.A((rp0.y) obj2);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                x xVar2 = this.f274473w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = x.I2(xVar2, this.f274474x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xVar2.f274478q.x((rp0.y) obj2);
                return Unit.f186387a;
        }
    }
}
