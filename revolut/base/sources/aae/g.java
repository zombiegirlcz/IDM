package aae;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import yhm.o;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f2813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f2814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LocalDate f2815y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, p pVar, LocalDate localDate, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f2813w = hVar;
        this.f2814x = pVar;
        this.f2815y = localDate;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f2813w, this.f2814x, this.f2815y, continuation, 0);
            default:
                return new g(this.f2813w, this.f2814x, this.f2815y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    xua.a aVar2 = this.f2813w.f2817q;
                    p pVar = this.f2814x;
                    String id10 = pVar.f249314a.f160150a;
                    String str = pVar.L;
                    q qVar = (q) aVar2;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    int i2 = 22;
                    pfm.a aVar3 = new pfm.a(qVar.m(), new yta.c(i2, new wg9.p(qVar, id10, this.f2815y, str, 13)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    h hVar = this.f2813w;
                    g gVar = new g(hVar, this.f2814x, this.f2815y, null, 0);
                    this.v = 1;
                    if (do3.q.t(hVar, gVar, this) == aVar4) {
                        return aVar4;
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
