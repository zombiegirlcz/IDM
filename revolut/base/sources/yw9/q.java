package yw9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f317372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f317373x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(w wVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f317372w = wVar;
        this.f317373x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f317372w, this.f317373x, continuation, 0);
            default:
                return new q(this.f317372w, this.f317373x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ang.f fVar = this.f317372w.o;
                    String str = this.f317373x;
                    Intrinsics.h(str);
                    pfm.t tVarC = ylg.b.c(fVar, zhm.u.c(new eo3.b(str)));
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar) {
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
                    w wVar = this.f317372w;
                    q qVar = new q(wVar, this.f317373x, null, 0);
                    this.v = 1;
                    if (u0.b0(wVar.X(), "CTA_BUTTON_TAG", qVar, this) == aVar2) {
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
