package g23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import cu8.r0;
import et6.h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends yji.n implements j23.m {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f139842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0 f139843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k23.f f139844n;
    public final k23.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.h f139845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f139846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hr6.l f139847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f139848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f73.b f139849t;

    public z(OrderNewCardTabControllerContract$InputData inputData, l0 itemBuilder, k23.f sharedDataSource, k23.b cardDesignsProvider, gr6.h freelancerCashbackInteractor, h1 freelancerInteractor, hr6.l freelancerCommandFactory, r0 kycRequiredActionTransformer, f73.b revolutCardNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(cardDesignsProvider, "cardDesignsProvider");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        this.f139842l = inputData;
        this.f139843m = itemBuilder;
        this.f139844n = sharedDataSource;
        this.o = cardDesignsProvider;
        this.f139845p = freelancerCashbackInteractor;
        this.f139846q = freelancerInteractor;
        this.f139847r = freelancerCommandFactory;
        this.f139848s = kycRequiredActionTransformer;
        this.f139849t = revolutCardNavigationCommandFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.retail.core.navigation.NaviCommand r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g23.y
            if (r0 == 0) goto L13
            r0 = r7
            g23.y r0 = (g23.y) r0
            int r1 = r0.f139841x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139841x = r1
            goto L18
        L13:
            g23.y r0 = new g23.y
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f139841x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.retail.core.navigation.NaviCommand r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f139841x = r4
            cu8.r0 r7 = r5.f139848s
            java.lang.Object r7 = ks8.m.b(r7, r0)
            if (r7 != r1) goto L48
            goto L6e
        L48:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.i
            if (r2 == 0) goto L57
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r6 = r7.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            return r6
        L57:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L76
            r7 = 0
            r0.u = r7
            r0.f139841x = r3
            hr6.l r7 = r5.f139847r
            ct6.m r7 = (ct6.m) r7
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            com.revolut.retail.core.navigation.feature.FeatureConfig r7 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r7)
            return r6
        L76:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.z.Z2(com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j23.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r28, java.lang.String r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.z.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
