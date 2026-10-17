package fr8;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import fo1.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorTransferAmountScreenContract$InputData f137433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f137434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f137435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f137436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f137437t;
    public final j9i.d u;
    public final ir8.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f137438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f137439x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(JuniorTransferAmountScreenContract$InputData inputData, wsg.n walletInteractor, hj8.a juniorProfileInteractor, w80.b amountFormatter, n60.a keyboardExtension, j9i.d reactionsKeyboardViewExtension, ir8.a transferValidator, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewExtension, "reactionsKeyboardViewExtension");
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f137433p = inputData;
        this.f137434q = walletInteractor;
        this.f137435r = juniorProfileInteractor;
        this.f137436s = amountFormatter;
        this.f137437t = keyboardExtension;
        this.u = reactionsKeyboardViewExtension;
        this.v = transferValidator;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f137438w = new l(0L, "", "", new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new hrf.h(u.c(ir8.b.f168012a), f0.f322471a, null));
        this.f137439x = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new b0(this, continuation, 4), new yi5.b(26));
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f137439x, new f5h.b(continuation, this, 12)), h0.f322473a), null, null, new fna.f(this, continuation, 6), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f137438w;
    }

    public final xi0.b y2() {
        Object content = ((l) t2()).f.getContent();
        if (content != null) {
            return (xi0.b) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
