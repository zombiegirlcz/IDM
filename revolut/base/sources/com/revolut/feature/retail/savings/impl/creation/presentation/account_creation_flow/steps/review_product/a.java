package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public SavingsProduct u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f83294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f83295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f83296y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Object obj2, String str, Continuation continuation) {
        super(1, continuation);
        this.f83294w = obj2;
        this.f83295x = bVar;
        this.f83296y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f83295x, this.f83294w, this.f83296y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
    
        if (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(r1, r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0238, code lost:
    
        if (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(r1, r3, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0257, code lost:
    
        if (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(r1, r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0320, code lost:
    
        if (r1 == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if (r1.O2(r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (r1.O2(r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0121, code lost:
    
        if (r1.O2(r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        if (r1.O2(r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(r1, r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d3, code lost:
    
        if (r1.O2(r2, r23) == r7) goto L168;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
