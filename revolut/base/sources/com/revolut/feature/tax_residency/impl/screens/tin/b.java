package com.revolut.feature.tax_residency.impl.screens.tin;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f90131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f90133y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, String str2, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f90131w = str;
        this.f90132x = str2;
        this.f90133y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f90131w, this.f90132x, this.f90133y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f90131w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = c.y2(cVar, str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.x2(new roe.o(this.f90132x, 0, str, ((Boolean) obj2).booleanValue(), this.f90133y));
        return Unit.f186387a;
    }
}
