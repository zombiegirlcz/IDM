package com.revolut.trading.orders.ui.invest.placement.target_price;

import cli.g;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.concurrent.atomic.AtomicBoolean;
import k4l.r0;
import kge.d;
import kgm.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import oqk.c;
import org.jetbrains.annotations.NotNull;
import ou6.o;
import oul.k;
import oul.l;
import oul.m;
import oul.n;
import oul.v;
import oul.w;
import oul.x;
import qul.e;
import vkm.j2;
import vkm.q;
import zh9.u0;
import zjh.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements m {

    @NotNull
    public static final w Companion = new w();
    public final AtomicBoolean A;
    public final Object B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final TargetPriceScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f107006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f107007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f107008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f107009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f107010t;
    public final d u;
    public final i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pak.h f107011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rul.e f107012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f107013y;
    public final Object z;

    public b(TargetPriceScreenContract$InputData input, k initialState, n stateMapper, l saveStateDelegate, e targetPriceDialogMapper, ybl.b instrumentTickerInteractor, f ipoInstrumentInteractor, j60.a bottomExpandableDialogControllerExtension, n60.a keyboardControllerExtension, d targetPriceInputValueBuilder, i targetPriceValidationBuilder, pak.h targetPriceOutputBuilder, ogm.i marketPriceBuilder, rul.e orderWarningBuilder) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(targetPriceDialogMapper, "targetPriceDialogMapper");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(targetPriceInputValueBuilder, "targetPriceInputValueBuilder");
        Intrinsics.checkNotNullParameter(targetPriceValidationBuilder, "targetPriceValidationBuilder");
        Intrinsics.checkNotNullParameter(targetPriceOutputBuilder, "targetPriceOutputBuilder");
        Intrinsics.checkNotNullParameter(marketPriceBuilder, "marketPriceBuilder");
        Intrinsics.checkNotNullParameter(orderWarningBuilder, "orderWarningBuilder");
        this.o = input;
        this.f107006p = targetPriceDialogMapper;
        this.f107007q = instrumentTickerInteractor;
        this.f107008r = ipoInstrumentInteractor;
        this.f107009s = bottomExpandableDialogControllerExtension;
        this.f107010t = keyboardControllerExtension;
        this.u = targetPriceInputValueBuilder;
        this.v = targetPriceValidationBuilder;
        this.f107011w = targetPriceOutputBuilder;
        this.f107012x = orderWarningBuilder;
        this.f107013y = te0.w.y0(new v(this, 2));
        this.z = te0.w.y0(new v(this, 3));
        this.A = new AtomicBoolean();
        this.B = te0.w.y0(new bib.b(this, initialState, stateMapper, saveStateDelegate, 25));
        this.C = hx7.e.a(this, new or4.i(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.trading.orders.ui.invest.placement.target_price.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof oul.c0
            if (r0 == 0) goto L13
            r0 = r8
            oul.c0 r0 = (oul.c0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            oul.c0 r0 = new oul.c0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f229892x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            k4l.r0 r1 = r0.f229891w
            com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue r2 = r0.v
            pak.h r0 = r0.u
            yhm.o.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            n60.a r8 = r7.f107010t
            r8.Q()
            pak.h r8 = r7.f107011w
            cli.g r2 = r7.getState()
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            oul.k r2 = (oul.k) r2
            com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue r2 = r2.f229907c
            k4l.r0 r4 = r7.J2()
            r0.u = r8
            r0.v = r2
            r0.f229891w = r4
            r0.z = r3
            java.lang.Object r3 = r7.f107013y
            java.lang.Object r3 = r3.getValue()
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            r5 = 0
            r6 = 3
            jhi.b r3 = mo3.a.g(r3, r5, r5, r6)
            java.lang.Object r0 = vkm.q.x(r3, r0)
            if (r0 != r1) goto L70
            return r1
        L70:
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r4
        L74:
            nel.n r8 = (nel.n) r8
            r0.getClass()
            java.lang.String r3 = "inputValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "orderType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "instrument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            hdf.b r3 = new hdf.b
            java.lang.Object r0 = r0.f234573b
            f7j.p r0 = (f7j.p) r0
            com.revolut.shared.feature.market_data.models.domain.models.Amount r8 = r0.a(r2, r8)
            r3.<init>(r1, r8)
            r7.C2(r3)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.target_price.b.I2(com.revolut.trading.orders.ui.invest.placement.target_price.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        ?? r06 = this.f107013y;
        Continuation continuation = null;
        yji.l.a1(this, (Flow) r06.getValue(), null, null, new x(this, continuation, 1), 3);
        yji.l.a1(this, (Flow) this.z.getValue(), null, null, new x(this, continuation, 2), 3);
        yji.l.a1(this, xam.a.h(new x(this, continuation, 0), (Flow) r06.getValue()), null, null, new x(this, continuation, 3), 3);
        yji.l.a1(this, xam.a.h(new x(this, continuation, 4), u0.m(new dr2.l(q.s(t1.e(getState().B(new o(6)), new c(this, 20)), new o(4), q.f290100b), 7), (Flow) r06.getValue())), null, null, new x(this, continuation, 5), 3);
    }

    public final r0 J2() {
        return ((k) ((j2) getState().f22677a).getValue()).f229906b;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ((ael.k) this.f107007q).p(this.o.f106996a, w4l.i.f294643c, n9l.b.SEC_3.a()), null, new x(this, null, 6), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final g getState() {
        return (g) this.B.getValue();
    }
}
