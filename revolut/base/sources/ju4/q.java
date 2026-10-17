package ju4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.x2;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends oki.h implements dli.b {
    public final CreditCardPseRepayContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f178592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f178593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f178594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.b f178595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ou4.a f178596t;
    public final y u;

    public q(CreditCardPseRepayContract$InputData inputData, al4.n creditCardInteractor, ang.f userInteractor, w80.b amountFormatter, n60.b keyboardViewControllerExtension, ou4.a creditCardRepayValidator, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(creditCardRepayValidator, "creditCardRepayValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f178592p = creditCardInteractor;
        this.f178593q = userInteractor;
        this.f178594r = amountFormatter;
        this.f178595s = keyboardViewControllerExtension;
        this.f178596t = creditCardRepayValidator;
        this.u = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.i(((x2) this.f178592p).A(this.o.f69594a, w4l.i.f294643c), nim.a.v(this.f178593q.j(w4l.j.f294644c), p.f), new jij.d(rd0.e.b(this.f178595s.d), 16)), new jlh.g(this, 27)), h0.f322473a), null, null, new jij.h(this, (Continuation) null, 29), 3);
    }

    public final a I2() {
        return (a) zi0.c.I(((b) ((j2) this.u.f22677a).getValue()).f178577a);
    }

    public final void J2(dj0.d inputAmount) {
        dj0.d maxAmount = I2().f178574a.f68742m;
        this.f178596t.getClass();
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        H2(this.u, new jp3.b(inputAmount, inputAmount.f(maxAmount) ? new dm4.e(maxAmount) : null, 14));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
