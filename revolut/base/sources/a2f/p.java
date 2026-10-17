package a2f;

import cli.y;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import tsk.t;
import vkm.j2;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends oki.h implements h {

    @NotNull
    private static final l Companion = new l();
    public final TradeRevPointsAccountRegistrationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qr0.i f827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f828t;

    public p(s stateMapper, TradeRevPointsAccountRegistrationScreenContract$InputData inputData, t accountsInteractor, b0 errorDialogFactory, ang.f userInteractor, qr0.i agentsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(errorDialogFactory, "errorDialogFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        this.o = inputData;
        this.f824p = accountsInteractor;
        this.f825q = errorDialogFactory;
        this.f826r = userInteractor;
        this.f827s = agentsInteractor;
        this.f828t = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(a2f.p r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof a2f.m
            if (r0 == 0) goto L13
            r0 = r6
            a2f.m r0 = (a2f.m) r0
            int r1 = r0.f820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f820w = r1
            goto L18
        L13:
            a2f.m r0 = new a2f.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f820w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28
            goto L44
        L28:
            r6 = move-exception
            goto L47
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            ang.f r6 = r5.f826r     // Catch: java.lang.Exception -> L28
            efm.d0 r6 = r6.f(r3)     // Catch: java.lang.Exception -> L28
            r0.f820w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = nim.a.b(r6, r0)     // Catch: java.lang.Exception -> L28
            if (r6 != r1) goto L44
            return r1
        L44:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Exception -> L28
            goto L52
        L47:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            r6 = r2
        L52:
            cli.y r0 = r5.f828t
            a2f.j r1 = new a2f.j
            r1.<init>(r6, r3)
            r5.H2(r0, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2f.p.I2(a2f.p, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        q0 q0VarN = rd0.e.n(this.f827s.h(this.o.f91132a, w4l.h.f294642c), h0.f322473a);
        Continuation continuation = null;
        yji.l.a1(this, q0VarN, null, null, new n(this, continuation, 0), 3);
        l2(new a01.e(this, continuation, 5), new yi5.b(26));
    }

    public final void J2() {
        String str;
        u2f.d dVar = (u2f.d) ((f) ((j2) this.f828t.f22677a).getValue()).f809a.getContent();
        if (dVar == null || (str = dVar.f276624m.f) == null) {
            return;
        }
        if (d0.W(str)) {
            str = null;
        }
        if (str != null) {
            C1(new ExternalDestination.Browser(str, null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f828t;
    }
}
