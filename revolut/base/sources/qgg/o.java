package qgg;

import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends jki.g implements jki.h {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelMilesAccountRegistrationScreenContract$InputData f245842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f245843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vfg.d f245844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f245845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f245846t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, TravelMilesAccountRegistrationScreenContract$InputData inputData, ang.f userInteractor, vfg.d accountsInteractor, b errorDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(errorDialogFactory, "errorDialogFactory");
        this.f245842p = inputData;
        this.f245843q = userInteractor;
        this.f245844r = accountsInteractor;
        this.f245845s = errorDialogFactory;
        m70.a.c(t0.f186434a);
        this.f245846t = new h(null, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(qgg.o r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof qgg.l
            if (r0 == 0) goto L13
            r0 = r5
            qgg.l r0 = (qgg.l) r0
            int r1 = r0.f245839w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245839w = r1
            goto L18
        L13:
            qgg.l r0 = new qgg.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245839w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f245843q
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f245839w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            a2f.j r0 = new a2f.j
            r1 = 17
            r0.<init>(r5, r1)
            r4.x2(r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qgg.o.y2(qgg.o, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 0), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f245846t;
    }
}
