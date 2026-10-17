package md9;

import cli.y;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m9d.y0;
import ma1.v;
import n30.n;
import skm.a2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements f {
    public final bng.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qpa.b f204543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q06.l f204544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gc9.a f204545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f204546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f204547t;
    public a2 u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f204548w;

    public l(cli.n stateMapper, bng.b accountLockManager, qpa.b pushInteractor, q06.l deeplinkRouter, gc9.a promptsInteractor, n chatInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountLockManager, "accountLockManager");
        Intrinsics.checkNotNullParameter(pushInteractor, "pushInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(promptsInteractor, "promptsInteractor");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        this.o = accountLockManager;
        this.f204543p = pushInteractor;
        this.f204544q = deeplinkRouter;
        this.f204545r = promptsInteractor;
        this.f204546s = chatInteractor;
        this.f204547t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(md9.l r5, w89.a r6, boolean r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof md9.i
            if (r0 == 0) goto L13
            r0 = r8
            md9.i r0 = (md9.i) r0
            int r1 = r0.f204539x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204539x = r1
            goto L18
        L13:
            md9.i r0 = new md9.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204539x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r6 = r0.u
            yhm.o.b(r8)
            goto L6d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            w89.c r8 = r6.f295617c
            w89.e r2 = r8.f295621c
            w89.e r4 = w89.e.NO_CHAT_TICKETS_EXIST
            if (r2 != r4) goto L40
            if (r7 == 0) goto L40
            r7 = r3
            goto L41
        L40:
            r7 = 0
        L41:
            boolean r6 = r6.f295615a
            if (r6 == 0) goto L59
            if (r7 == 0) goto L59
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r8 = "Invalid state: skipIntro is true, so main action should be handled, but it's marked to be ignored"
            r6.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r6, r8)
            goto L6e
        L59:
            if (r6 == 0) goto L6e
            boolean r6 = r5.f204548w
            if (r6 != 0) goto L6e
            r5.f204548w = r3
            r0.u = r7
            r0.f204539x = r3
            java.lang.Object r6 = r5.K2(r8, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r6 = r7
        L6d:
            r7 = r6
        L6e:
            cli.y r6 = r5.f204547t
            lph.c r8 = new lph.c
            r0 = 6
            r8.<init>(r7, r0)
            r5.H2(r6, r8)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: md9.l.I2(md9.l, w89.a, boolean, gim.c):java.lang.Object");
    }

    public static final void J2(l lVar) {
        if (lVar.v) {
            return;
        }
        lVar.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)))));
        lVar.v = true;
    }

    @Override // yji.l
    public final void I1() {
        r map = this.f204543p.f248320a.switchMapSingle(new v(22, new h(this, 0))).filter(new v(23, new md0.c(5))).map(new v(24, new md0.c(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(this, rd0.e.b(map), null, null, new y0(this, null, 8), 3);
    }

    public final Object K2(w89.c cVar, gim.c cVar2) {
        return nim.a.b(((s06.j) this.f204544q).c(cVar.f295620b, false, lg0.a.IGNORE), cVar2);
    }

    @Override // yji.l
    public final void T1(long j2) {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = n2(new j(this, continuation, 0), new h(this, 1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204547t;
    }
}
