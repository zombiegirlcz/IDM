package com.revolut.feature.credit.application.plugins.impl.ui.congratulations;

import c84.t;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$Step;
import d8l.d;
import e84.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vvc.s;
import w64.f;
import yji.l;
import yki.i;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements w64.a {

    @NotNull
    public static final w64.b Companion = new w64.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qw3.a f67256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CongratulationFlowContract$InputData f67257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f67258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LargeActionButtonDelegate f67259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f67260t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qw3.a interactor, CongratulationFlowContract$InputData inputData, j60.a bottomDialogExtension, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67256p = interactor;
        this.f67257q = inputData;
        this.f67258r = bottomDialogExtension;
        this.f67259s = new LargeActionButtonDelegate();
        this.f67260t = d.a(this, new s(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable P2(com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b r5, ft3.h1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof w64.c
            if (r0 == 0) goto L13
            r0 = r7
            w64.c r0 = (w64.c) r0
            int r1 = r0.f295374w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295374w = r1
            goto L18
        L13:
            w64.c r0 = new w64.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295374w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            goto L4f
        L28:
            r5 = move-exception
            goto L52
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            qw3.a r5 = r5.f67256p     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            r0.f295374w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            v24.a r5 = r5.f249761a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            r5.getClass()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            v06.i r7 = new v06.i     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            r2 = 2
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r7 = skm.e0.J(r5, r7, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            if (r7 != r1) goto L4f
            return r1
        L4f:
            it3.d r7 = (it3.d) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L5e
            return r7
        L52:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r0 = "Can't accept congratulations"
            rd0.d.a(r7, r4, r0, r5, r6)
            return r4
        L5e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b.P2(com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b, ft3.h1, gim.c):java.io.Serializable");
    }

    @Override // yki.j
    public final void M0() {
        CongratulationsScreenConfig congratulationsScreenConfig = this.f67257q.f67253b;
        if (congratulationsScreenConfig instanceof CongratulationsScreenConfig.Prompt) {
            h.u2(this, this.f67260t, new CongratulationFlowContract$Step.Prompt((CongratulationsScreenConfig.Prompt) congratulationsScreenConfig), null, 6);
        } else {
            if (!(congratulationsScreenConfig instanceof CongratulationsScreenConfig.Popup)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new w64.e(this, null), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        LargeActionButtonDelegate largeActionButtonDelegate = this.f67259s;
        l.b1(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new f(this, null), 3);
        this.f67258r.d(u.c(largeActionButtonDelegate));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67260t;
    }
}
