package a32;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import ip0.v7;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends oki.h implements p {

    @NotNull
    public static final r Companion = new r();
    public final ApmPaymentAuthorisationNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f1008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f12.a f1009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g32.b f1010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x02.d f1011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f1012t;
    public final z1 u;

    public a0(ApmPaymentAuthorisationNavigation$InputData inputData, f interactor, f12.a extension, g32.b validatorExtension, x02.d quoteRouter, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(quoteRouter, "quoteRouter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f1008p = interactor;
        this.f1009q = extension;
        this.f1010r = validatorExtension;
        this.f1011s = quoteRouter;
        this.f1012t = mra.d.b(this, new m(inputData.f62315a, zi0.c.P(inputData.f62317c, false, null, 3), inputData.d, null, new Data(null, null, false, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.u = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(a32.a0 r4, z22.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof a32.y
            if (r0 == 0) goto L13
            r0 = r6
            a32.y r0 = (a32.y) r0
            int r1 = r0.f1043x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1043x = r1
            goto L18
        L13:
            a32.y r0 = new a32.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1043x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a32.a0 r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            x02.d r6 = r4.f1011s
            x02.c r2 = x02.c.CORAL
            r0.u = r4
            r0.f1043x = r3
            q12.l r6 = (q12.l) r6
            java.lang.Object r6 = r6.a(r5, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            dki.p r6 = (dki.p) r6
            a0.c r0 = new a0.c
            r1 = 11
            r0.<init>(r4, r1)
            r4 = 0
            yji.l.i2(r5, r6, r4, r0, r3)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.a0.I2(a32.a0, z22.a, gim.c):java.lang.Object");
    }

    public static void J2(String str) {
        Intrinsics.checkNotNullExpressionValue("a0", "TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "a0", j6.a.q("APM PendingPaymentAuthorisation: ", str), null, null, 16);
    }

    @Override // yji.l
    public final void I1() {
        J2("create: " + this.o.f62317c);
        Continuation continuation = null;
        l2(new t(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(v7.w(this.f1012t.B(new a09.a(28))), new a0e.m(continuation, this, 4)), null, null, new a0l.k(this, continuation, 3), 3);
    }

    public final z22.a K2() {
        z22.a aVar = ((m) ((j2) this.f1012t.f22677a).getValue()).d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f1012t;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f1009q.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }
}
