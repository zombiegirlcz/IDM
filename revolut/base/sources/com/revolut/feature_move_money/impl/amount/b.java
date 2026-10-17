package com.revolut.feature_move_money.impl.amount;

import b6i.j;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ AccountWrapper A;
    public Object u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.kompot.navigable.vc.modal.a f97283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f97284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f97285y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j jVar, AccountWrapper accountWrapper, Continuation continuation) {
        super(1, continuation);
        this.f97285y = cVar;
        this.z = jVar;
        this.A = accountWrapper;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f97285y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010f A[LOOP:0: B:41:0x0109->B:43:0x010f, LOOP_END] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.amount.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
