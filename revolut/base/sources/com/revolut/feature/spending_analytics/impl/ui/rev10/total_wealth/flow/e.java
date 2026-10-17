package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ SmartEstimationAccess A;
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f87996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CustomAsset f87997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CustomAssetCategoryDefinition f87998y;
    public final /* synthetic */ xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, f fVar, CustomAsset customAsset, CustomAssetCategoryDefinition customAssetCategoryDefinition, xi0.b bVar, SmartEstimationAccess smartEstimationAccess, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f87996w = fVar;
        this.f87997x = customAsset;
        this.f87998y = customAssetCategoryDefinition;
        this.z = bVar;
        this.A = smartEstimationAccess;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f87996w, this.f87997x, this.f87998y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(r2, r10.f87997x, r10.f87998y, r10.z, r10.v, r10.A, r10) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f r2 = r10.f87996w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r11)
            goto L63
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            yhm.o.b(r11)
            goto L32
        L1e:
            yhm.o.b(r11)
            boolean r11 = r10.v
            if (r11 == 0) goto L36
            dtd.a r11 = r2.f88002s
            r10.u = r4
            dtd.d r11 = (dtd.d) r11
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L32
            goto L62
        L32:
            com.revolut.feature.product_article.api.models.ProductArticleParams r11 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r11
        L34:
            r5 = r11
            goto L38
        L36:
            r11 = 0
            goto L34
        L38:
            if (r5 == 0) goto L4f
            yki.i r11 = r2.u
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step$SmartEstimationProductArticle r4 = new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step$SmartEstimationProductArticle
            xi0.b r8 = r10.z
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess r9 = r10.A
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r6 = r10.f87997x
            com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition r7 = r10.f87998y
            r4.<init>(r5, r6, r7, r8, r9)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r11, r4, r0)
            goto L63
        L4f:
            r10.u = r3
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r3 = r10.f87997x
            com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition r4 = r10.f87998y
            xi0.b r5 = r10.z
            boolean r6 = r10.v
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess r7 = r10.A
            r8 = r10
            java.lang.Object r11 = com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
