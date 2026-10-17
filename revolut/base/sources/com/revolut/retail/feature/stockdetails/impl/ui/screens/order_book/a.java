package com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book;

import bwk.m;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nel.w0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function1 {
    public w0 u;
    public TradingAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f104038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f104039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f104040y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, float f, Continuation continuation) {
        super(1, continuation);
        this.f104039x = mVar;
        this.f104040y = f;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f104039x, this.f104040y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (bwk.m.J2(r0, r1, r2, r14.f104040y, r5, r14) != r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
