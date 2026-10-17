package kvl;

import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import java.util.Optional;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f190155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f190156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.n f190157n;
    public final n60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f190158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.k f190159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f190160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f190161s;

    public a0(e inputData, d dialogMapper, wsg.n walletInteractor, n60.a keyboardControllerExtension, j60.a bottomExpandableDialogControllerExtension, ybl.k tradingAccountsInteractor, ybl.l configInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f190155l = inputData;
        this.f190156m = dialogMapper;
        this.f190157n = walletInteractor;
        this.o = keyboardControllerExtension;
        this.f190158p = bottomExpandableDialogControllerExtension;
        this.f190159q = tradingAccountsInteractor;
        this.f190160r = configInteractor;
        this.f190161s = vkm.q.c(null);
    }

    @Override // kvl.c
    public final void Z2() {
        V2(new v(this, null, 0), new yi5.b(29));
    }

    @Override // kvl.c
    public final void b3() {
        V2(new v(this, null, 1), new yi5.b(29));
    }

    @Override // kvl.c
    public final void c3() {
        V2(new v(this, null, 2), new yi5.b(29));
    }

    @Override // kvl.c
    public final void d3() {
        j60.a.v(this.f190158p, false, null, 3);
    }

    @Override // kvl.c
    public final void e3(AutoTopUpSource.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        V2(new y(this, pocket, null), new yi5.b(29));
    }

    @Override // kvl.c
    public final void f3() {
        V2(new v(this, null, 3), new yi5.b(29));
    }

    public final Flow g3(r0 orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = s.f190173a[orderType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return zi0.c.i(AutoTopUpStatus.Unavailable.f91772a);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return xam.a.h(new t(this, null), nim.a.v(rd0.e.b(ybl.l.c(this.f190160r, false, 3)), new kvg.j(5)));
    }

    public final void h3(AutoTopUpStatus autoTopUpStatus) {
        Optional optionalOfNullable;
        if (autoTopUpStatus == null || autoTopUpStatus.equals(AutoTopUpStatus.Unavailable.f91772a)) {
            optionalOfNullable = null;
        } else {
            if (!(autoTopUpStatus instanceof AutoTopUpStatus.Available)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalOfNullable = Optional.ofNullable(((AutoTopUpStatus.Available) autoTopUpStatus).f91771a);
        }
        this.f190161s.setValue(optionalOfNullable);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(gim.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof kvl.z
            if (r0 == 0) goto L13
            r0 = r14
            kvl.z r0 = (kvl.z) r0
            int r1 = r0.f190177w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190177w = r1
            goto L18
        L13:
            kvl.z r0 = new kvl.z
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190177w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto Lad
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L30:
            yhm.o.b(r14)
            io3.l r6 = io3.l.CURRENT
            io3.k r7 = io3.k.ACTIVE
            io3.i r8 = io3.i.INTERNAL
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            wsg.n r4 = r13.f190157n
            w4l.i r5 = w4l.i.f294643c
            r9 = 0
            r10 = 0
            efm.r r14 = osg.b.g(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            vkm.d r14 = rd0.e.b(r14)
            kotlinx.coroutines.flow.Flow r14 = vkm.q.q(r14)
            kvl.e r2 = r13.f190155l
            java.util.UUID r2 = r2.f190162a
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            ybl.k r4 = r13.f190159q
            akg.n r2 = ybl.k.d(r4, r2)
            t38.e r14 = zh9.u0.m(r14, r2)
            kvl.r r2 = new kvl.r
            r4 = 1
            r2.<init>(r13)
            akg.n r14 = nim.a.v(r14, r2)
            w4l.h r2 = w4l.h.f294642c
            com.revolut.core.model.account.AccountId$Personal r4 = com.revolut.core.model.account.AccountId.Personal.f51414a
            wsg.n r5 = r13.f190157n
            efm.r r2 = r5.J(r4, r2)
            vkm.d r2 = rd0.e.b(r2)
            klf.a3 r4 = new klf.a3
            r5 = 11
            r6 = 0
            r4.<init>(r6, r13, r5)
            vkm.j2 r5 = r13.f190161s
            wkm.l r4 = vkm.q.Q(r5, r4)
            akg.n r14 = zh9.u0.i(r14, r2, r4)
            kvl.r r2 = new kvl.r
            r4 = 0
            r2.<init>(r13)
            akg.n r14 = nim.a.v(r14, r2)
            ku1.f0 r2 = new ku1.f0
            r4 = 13
            r2.<init>(r4)
            jhi.b r14 = mo3.a.g(r14, r6, r2, r3)
            r0.f190177w = r3
            java.lang.Object r14 = vkm.q.x(r14, r0)
            if (r14 != r1) goto Lad
            return r1
        Lad:
            rp0.y r14 = (rp0.y) r14
            j60.a r0 = r13.f190158p
            r0.x(r14)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kvl.a0.i3(gim.c):java.lang.Object");
    }
}
