package rrc;

import android.content.ActivityNotFoundException;
import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends oki.h implements dli.b {

    @NotNull
    public static final x Companion = new x();
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wpc.f f256766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f256767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vpc.a f256768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mkd.d f256769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.n f256770t;
    public final kbb.c u;
    public final wpc.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f256771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f256772x;

    public f0(cli.n stateMapper, c70.a clipboard, wpc.f inputData, ang.f userInteractor, vpc.a salarySwitchInteractor, mkd.d slotManagerFeedControllerModelExtension, wsg.n walletInteractor, kbb.c accountDetailsInteractor, wpc.b shareSalaryDetailsDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(salarySwitchInteractor, "salarySwitchInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(shareSalaryDetailsDestinationProvider, "shareSalaryDetailsDestinationProvider");
        this.o = clipboard;
        this.f256766p = inputData;
        this.f256767q = userInteractor;
        this.f256768r = salarySwitchInteractor;
        this.f256769s = slotManagerFeedControllerModelExtension;
        this.f256770t = walletInteractor;
        this.u = accountDetailsInteractor;
        this.v = shareSalaryDetailsDestinationProvider;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f256771w = z1VarB;
        this.f256772x = mra.d.b(this, new v(false, false, zhm.f0.f322471a, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(rrc.f0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof rrc.y
            if (r0 == 0) goto L13
            r0 = r5
            rrc.y r0 = (rrc.y) r0
            int r1 = r0.f256807w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256807w = r1
            goto L18
        L13:
            rrc.y r0 = new rrc.y
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256807w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            wpc.f r5 = r4.f256766p
            java.lang.String r5 = r5.a()
            if (r5 != 0) goto L50
            wsg.n r4 = r4.f256770t
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r4 = r4.x(r5)
            r0.f256807w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            xi0.b r5 = (xi0.b) r5
            java.lang.String r4 = r5.f306286a
            return r4
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.f0.I2(rrc.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(rrc.f0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof rrc.d0
            if (r0 == 0) goto L13
            r0 = r5
            rrc.d0 r0 = (rrc.d0) r0
            int r1 = r0.f256760w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256760w = r1
            goto L18
        L13:
            rrc.d0 r0 = new rrc.d0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256760w
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
            ang.f r4 = r4.f256767q
            r5 = 0
            efm.d0 r4 = r4.f(r5)
            r0.f256760w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            do3.n r5 = (do3.n) r5
            java.lang.String r4 = te0.w.I(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.f0.J2(rrc.f0, gim.c):java.lang.Object");
    }

    public static final void K2(f0 f0Var, aii.u uVar) {
        if (!(uVar instanceof ExternalDestination.ByIntent)) {
            f0Var.C1(uVar);
            return;
        }
        try {
            f0Var.C1(uVar);
            f0Var.H2(f0Var.f256772x, new rpi.e(12));
        } catch (ActivityNotFoundException e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    @Override // yji.l
    public final void I1() {
        qna.n nVar = new qna.n(this.f256771w, this, 23);
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(nVar, new z(null, this)), null, null, new b0(this, continuation, 0), 3);
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.SUGGEST_SWITCH_SALARY));
        gld.f0 f0Var = (gld.f0) this.f256769s;
        f0Var.c3(aVar);
        yji.l.a1(this, rd0.e.e(mo3.a.g(f0Var.f144638l.h(), null, new rnd.d0(15), 1), zhm.h0.f322473a, new qtb.o(3, 12, continuation)), null, null, new b0(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f256766p.M() == wpc.e.POPUP && ((v) ((j2) this.f256772x.f22677a).getValue()).f256800a) {
            C2(wpc.g.f299221a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f256772x;
    }
}
