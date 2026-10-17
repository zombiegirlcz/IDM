package vkf;

import chc.c0;
import cmf.p;
import elf.s0;
import gce.l;
import kkf.x5;
import klf.f2;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vdl.c1;
import vge.f1;
import vkm.q;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f289936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f289937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kof.f f289938n;
    public final f2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final od0.i f289939p;

    public j(h0 commonDataSource, m1 juniorDataSource, kof.f incomeSorterContentProvider, f2 slotDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(incomeSorterContentProvider, "incomeSorterContentProvider");
        Intrinsics.checkNotNullParameter(slotDataSource, "slotDataSource");
        od0.i customIncomeSorterPromptItemsProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(customIncomeSorterPromptItemsProvider, "customIncomeSorterPromptItemsProvider");
        this.f289936l = commonDataSource;
        this.f289937m = juniorDataSource;
        this.f289938n = incomeSorterContentProvider;
        this.o = slotDataSource;
        this.f289939p = customIncomeSorterPromptItemsProvider;
    }

    public final p Z2() {
        if (this.f289939p.g() != null) {
            throw new ClassCastException();
        }
        Continuation continuation = null;
        return new p(ta6.a.h(rd0.e.e(q.Q(this.f289936l.d(), new c1(continuation, this, 11)), zhm.h0.f322473a, new f1(3, 12, continuation)), new x5((Flow) this.o.f185480c.getValue(), 14), this.f289937m.a(), new l(this, continuation, 2)), new c0(23), u.c(this), "IncomeSorterBanner");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof vkf.g
            if (r0 == 0) goto L13
            r0 = r7
            vkf.g r0 = (vkf.g) r0
            int r1 = r0.f289933w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289933w = r1
            goto L1a
        L13:
            vkf.g r0 = new vkf.g
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289933w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L99
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            boolean r7 = r5 instanceof com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterCreateParcel
            if (r7 == 0) goto L4e
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterCreateParcel r5 = (com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterCreateParcel) r5
            java.lang.String r5 = r5.f92094a
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation r7 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation
            r7.<init>(r5)
            r6.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.A2(r5)
            goto Lb0
        L4e:
            boolean r7 = r5 instanceof com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterDetailsParcel
            if (r7 == 0) goto L68
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterDetails r7 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterDetails
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterDetailsParcel r5 = (com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterDetailsParcel) r5
            java.lang.String r5 = r5.f92095a
            r7.<init>(r5)
            r6.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.A2(r5)
            goto Lb0
        L68:
            boolean r7 = r5 instanceof com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterExecutionParcel
            if (r7 == 0) goto L82
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterExecutionScreen r7 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterExecutionScreen
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterExecutionParcel r5 = (com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.income_sorter.IncomeSorterContentProvider$IncomeSorterExecutionParcel) r5
            java.lang.String r5 = r5.f92096a
            r7.<init>(r5)
            r6.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.A2(r5)
            goto Lb0
        L82:
            java.lang.String r5 = "income_sorter_banner_id"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto Laf
            klf.h0 r5 = r4.f289936l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r0.f289933w = r3
            java.lang.Object r7 = vkm.q.x(r5, r0)
            if (r7 != r1) goto L99
            return r1
        L99:
            tof.a3 r7 = (tof.a3) r7
            java.lang.String r5 = r7.f272581b
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation r7 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation
            r7.<init>(r5)
            r6.<init>(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.A2(r5)
            goto Lb0
        Laf:
            r3 = 0
        Lb0:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.j.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
