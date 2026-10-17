package yna;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f315386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f315387x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(c1 c1Var, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f315386w = c1Var;
        this.f315387x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z0(this.f315386w, this.f315387x, continuation, 0);
            case 1:
                return new z0(this.f315386w, this.f315387x, continuation, 1);
            default:
                return new z0(this.f315386w, this.f315387x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f315387x;
        c1 c1Var = this.f315386w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ang.f fVar = c1Var.z;
                    Intrinsics.h(str);
                    pfm.t tVarC = ylg.b.c(fVar, zhm.u.c(new eo3.b(str)));
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z0 z0Var = new z0(c1Var, str, continuation, 0);
                    this.v = 1;
                    if (c1Var.p2(this, z0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j0 j0Var = new j0(c1Var, str, continuation, i2);
                skm.p0 p0Var = skm.p0.f264001a;
                elm.f fVar2 = elm.f.f127540b;
                this.v = 1;
                Object objJ = skm.e0.J(fVar2, j0Var, this);
                return objJ == aVar3 ? aVar3 : objJ;
        }
    }
}
