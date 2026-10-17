package bnh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.i implements Function2 {
    public c0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f17174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qjh.a f17175x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, qjh.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f17174w = c0Var;
        this.f17175x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.f17174w, this.f17175x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c0 c0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            c0 c0Var2 = this.f17174w;
            clc.b bVar = c0Var2.f17177l;
            String str = this.f17175x.f246882b.f95703c;
            this.u = c0Var2;
            this.v = 1;
            Object objD = ((com.revolut.feature.robo.impl.navigation.c) bVar).d(str, this);
            if (objD == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            obj2 = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = this.u;
            yhm.o.b(obj2);
        }
        return c0Var.A2((aii.u) obj2);
    }
}
