package com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout;

import com.revolut.feature.store.core.api.model.StoreProductOption;
import fvb.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f83603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StoreProductOption f83604x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, StoreProductOption storeProductOption, Continuation continuation) {
        super(1, continuation);
        this.f83603w = dVar;
        this.f83604x = storeProductOption;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f83603w, this.f83604x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r1.l(r2, r14) != r10) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
