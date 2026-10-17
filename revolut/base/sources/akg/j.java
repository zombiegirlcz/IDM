package akg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f5939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f5940x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5939w = oVar;
        this.f5940x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f5939w, this.f5940x, continuation, 0);
            default:
                return new j(this.f5939w, this.f5940x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar2 = this.f5939w.f;
                    o.Companion.getClass();
                    tk0.b.b("FLIP_GESTURE_ENABLED");
                    tk0.b bVar = new tk0.b("FLIP_GESTURE_ENABLED");
                    Boolean boolValueOf = Boolean.valueOf(this.f5940x);
                    this.v = 1;
                    if (aVar2.e(bVar, boolValueOf, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z = this.f5940x;
                o oVar = this.f5939w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ip.b bVar2 = oVar.f5952c;
                    mk0.a aVar4 = oVar.f;
                    o.Companion.getClass();
                    tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                    tk0.b bVar3 = new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    this.v = 1;
                    if (aVar4.e(bVar3, boolValueOf2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, oVar.f5950a, "HIDE_BOTTOM_BAR", Boolean.valueOf(z));
                w4l.f fVar = oVar.f5954h;
                Unit unit = Unit.f186387a;
                fVar.k(unit, Boolean.valueOf(z));
                return unit;
        }
    }
}
