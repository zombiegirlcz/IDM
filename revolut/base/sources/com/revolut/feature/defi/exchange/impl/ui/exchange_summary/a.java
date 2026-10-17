package com.revolut.feature.defi.exchange.impl.ui.exchange_summary;

import b46.c;
import bof.r;
import bw4.s;
import c46.b;
import c46.e;
import c46.n;
import c46.o;
import cli.g;
import cli.y;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import elm.f;
import kgm.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lhk.a0;
import oki.h;
import s36.p;
import sh5.d;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements e {
    public final y A;
    public final DeFiExchangeSummaryContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f71776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f71777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f71778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f71779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f71780t;
    public final c u;
    public final o36.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i46.a f71781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g26.b f71782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f71783y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(r stateMapper, DeFiExchangeSummaryContract$InputData inputData, wj0.a idempotencyKeyHolder, i swapInteractor, p swapSubmissionInteractor, d cryptoFcaDisclaimerWidget, b statusDialogConfigMapper, c draftMutator, o36.d secondaryCurrencyRepository, i46.a riskConfirmationMapper, g26.b assetDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(swapInteractor, "swapInteractor");
        Intrinsics.checkNotNullParameter(swapSubmissionInteractor, "swapSubmissionInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(statusDialogConfigMapper, "statusDialogConfigMapper");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(secondaryCurrencyRepository, "secondaryCurrencyRepository");
        Intrinsics.checkNotNullParameter(riskConfirmationMapper, "riskConfirmationMapper");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        this.o = inputData;
        this.f71776p = idempotencyKeyHolder;
        this.f71777q = swapInteractor;
        this.f71778r = swapSubmissionInteractor;
        this.f71779s = cryptoFcaDisclaimerWidget;
        this.f71780t = statusDialogConfigMapper;
        this.u = draftMutator;
        this.v = secondaryCurrencyRepository;
        this.f71781w = riskConfirmationMapper;
        this.f71782x = assetDetailsInteractor;
        this.f71783y = new vii.b();
        this.z = hx7.e.a(this, new bwd.a(this, 16));
        this.A = mra.d.b(this, new c46.c(inputData.f71772b, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof c46.o
            if (r0 == 0) goto L13
            r0 = r5
            c46.o r0 = (c46.o) r0
            int r1 = r0.f21098w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21098w = r1
            goto L18
        L13:
            c46.o r0 = new c46.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21098w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L4b
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.f21098w = r3     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L4b
            java.lang.Object r4 = r4.J2(r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L4b
            if (r4 != r1) goto L48
            return r1
        L3b:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            java.lang.String r2 = "Failed to persist DeFi exchange secondary currency"
            rd0.d.a(r0, r1, r2, r4, r5)
        L48:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L4b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a.I2(com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.f71776p.a("IDEMPOTENCY_TAG_DEFI_SWAP_SUBMIT");
    }

    public final Object J2(o oVar) throws Throwable {
        DeFiExchangeOrderDraft deFiExchangeOrderDraft = ((c46.c) ((j2) this.A.f22677a).getValue()).f21082a;
        xi0.b bVar = deFiExchangeOrderDraft.f71764b.f71768a;
        wd6.e eVar = deFiExchangeOrderDraft.d;
        o36.d dVar = this.v;
        dVar.getClass();
        a0 a0Var = new a0(dVar, eVar, bVar, null, 28);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, a0Var, oVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new bv4.h(this, continuation, 8), new whi.b(6));
        l.b1(this, q.Q(this.f71783y, new s(continuation, this, 6)), null, new n(this, continuation, 1), 3);
        l.b1(this, this.f71782x.b(this.o.f71772b.e.f71665a.f71671a, w4l.h.f294642c), null, new n(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
