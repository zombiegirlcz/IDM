package com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dt4.p;
import dze.d;
import dze.g;
import dze.j;
import dze.k;
import dze.m;
import dze.n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import nii.g0;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import skm.a2;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements g {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f90960x;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0f.d f90961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wwh.a f90962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f90963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f90964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f90965t;
    public a2 u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f90966w;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f90960x = kotlin.time.c.g(2, e.SECONDS);
    }

    public c(d inputData, c0f.d topUpPaymentObserver, wwh.a cpgInteractor) {
        List listL;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpPaymentObserver, "topUpPaymentObserver");
        Intrinsics.checkNotNullParameter(cpgInteractor, "cpgInteractor");
        this.o = inputData;
        this.f90961p = topUpPaymentObserver;
        this.f90962q = cpgInteractor;
        cue.d dVar = inputData.f121328b;
        cue.c cVar = dVar != null ? dVar.f : null;
        CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = inputData.f121327a;
        zve.a aVar = cardTopUpThreeDsUiModel != null ? cardTopUpThreeDsUiModel.f90956c : null;
        if (cVar != null) {
            String[] elements = {cVar.f108988a, cVar.f108989b, cVar.f108990c, cVar.d};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else if (aVar != null) {
            String[] elements2 = {aVar.f325665a, aVar.f325666b, aVar.f325667c, aVar.d};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else {
            listL = f0.f322471a;
        }
        this.f90963r = listL;
        this.f90964s = q.b(0, 2, f.DROP_OLDEST);
        this.f90965t = q.c(k.PAUSE);
        this.v = hx7.e.a(this, new p(this, 16));
        this.f90966w = mra.d.b(this, new dze.c(false, false, false, false), new a54.b(5), null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c r8, cue.d r9, gim.c r10) {
        /*
            cli.y r0 = r8.f90966w
            boolean r1 = r10 instanceof dze.p
            if (r1 == 0) goto L16
            r1 = r10
            dze.p r1 = (dze.p) r1
            int r2 = r1.f121339w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f121339w = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            dze.p r1 = new dze.p
            r1.<init>(r8, r10)
            goto L14
        L1c:
            java.lang.Object r10 = r7.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f121339w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto L4d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            wwh.a r10 = r8.f90962q
            r7.f121339w = r3
            exh.b r10 = (exh.b) r10
            exh.k r10 = r10.f130431b
            r2 = r10
            exh.g r2 = (exh.g) r2
            r4 = 150(0x96, float:2.1E-43)
            long r5 = com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c.f90960x
            r3 = r9
            java.lang.Object r10 = r2.b(r3, r4, r5, r7)
            if (r10 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L73
            dz7.k r9 = new dz7.k
            r10 = 5
            r9.<init>(r10)
            r8.H2(r0, r9)
            java.lang.Object r9 = r0.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            dze.c r9 = (dze.c) r9
            boolean r9 = r9.f121325b
            if (r9 != 0) goto L73
            vkm.j2 r8 = r8.f90965t
            dze.k r9 = dze.k.RESUME
            r8.setValue(r9)
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c.I2(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c, cue.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (this.f90963r.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("3DS challenge can't be executed without redirects");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            B2();
        }
        d0(true, false);
        l.a1(this, q.P(this.f90964s, 1), null, null, new n(this, continuation, 0), 3);
    }

    public final void J2() {
        H2(this.f90966w, new dz7.k(6));
        this.f90965t.setValue(k.PAUSE);
        h.v2(this.v, ThreeDsScreenContract$ModalStep.DiscardTopUpDialog.f90957a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new m(this, continuation, 1), new whi.b(6));
        boolean z = this.o.f121329c;
        y yVar = this.f90966w;
        if (z && ((dze.c) ((j2) yVar.f22677a).getValue()).f121324a) {
            l.b1(this, X1(new y0(null, new g0(new TextLocalisedClause(R$string.top_up_pending_title, null, null, 14), null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, null, false, null, false, null, 16374), false, 5)), null, new b(this, null), 3);
        }
        n2(new m(this, continuation, 2), new whi.b(6));
        dze.c cVar = (dze.c) ((j2) yVar.f22677a).getValue();
        if (cVar.f121325b) {
            return;
        }
        if (cVar.f121326c || cVar.d) {
            this.f90965t.setValue(k.RESUME);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f90966w;
    }
}
