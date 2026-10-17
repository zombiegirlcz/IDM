package u64;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData;
import g64.s;
import kotlin.jvm.internal.Intrinsics;
import tp8.l;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ComboCardOrderingFlowContract$InputData f277475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nw3.d f277476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u24.a f277477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f277478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f277479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ComboCardOrderingFlowContract$InputData inputData, e84.e pluginControllerResolver, nw3.d cardOrderingInteractor, u24.a comboCardOrderingRepository, s cardOrderingNavigationProvider) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        Intrinsics.checkNotNullParameter(cardOrderingInteractor, "cardOrderingInteractor");
        Intrinsics.checkNotNullParameter(comboCardOrderingRepository, "comboCardOrderingRepository");
        Intrinsics.checkNotNullParameter(cardOrderingNavigationProvider, "cardOrderingNavigationProvider");
        this.f277475p = inputData;
        this.f277476q = cardOrderingInteractor;
        this.f277477r = comboCardOrderingRepository;
        this.f277478s = cardOrderingNavigationProvider;
        this.f277479t = d8l.d.a(this, new l(this, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(u64.d r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof u64.b
            if (r0 == 0) goto L13
            r0 = r6
            u64.b r0 = (u64.b) r0
            int r1 = r0.f277473x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277473x = r1
            goto L18
        L13:
            u64.b r0 = new u64.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f277473x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u64.d r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            g64.s r6 = r5.f277478s
            com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData r2 = r5.f277475p
            com.revolut.feature.credit.application.models.plugins.PluginPayload r2 = r2.f67240b
            h93.l0 r4 = h93.l0.BRAZIL_LOCAL
            r0.u = r5
            r0.f277473x = r3
            java.lang.Object r6 = r6.c(r2, r4, r3, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r6)
            r5.C1(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u64.d.P2(u64.d, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null, 1), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f277479t;
    }
}
