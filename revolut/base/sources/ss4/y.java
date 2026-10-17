package ss4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r1;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends oki.h implements n {

    @NotNull
    public static final t Companion = new t();
    public final CreditCardInstalmentRepayChooseAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f265305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final al4.m f265306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f265307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f265308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f265309t;

    public y(CreditCardInstalmentRepayChooseAmountScreenContract$InputData inputData, wsg.n walletInteractor, al4.m creditCardInstalmentInteractor, j60.a bottomExpandableDialogExtension, w80.b amountFormatter, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f265305p = walletInteractor;
        this.f265306q = creditCardInstalmentInteractor;
        this.f265307r = bottomExpandableDialogExtension;
        this.f265308s = amountFormatter;
        this.f265309t = mra.d.b(this, new l(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarV;
        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = this.o;
        ql4.v vVar = creditCardInstalmentRepayChooseAmountScreenContract$InputData.f69461c;
        String str = creditCardInstalmentRepayChooseAmountScreenContract$InputData.f69460b;
        String str2 = creditCardInstalmentRepayChooseAmountScreenContract$InputData.f69459a;
        int i = u.f265299a[vVar.ordinal()];
        w4l.h hVar = w4l.h.f294642c;
        al4.m mVar = this.f265306q;
        if (i == 1) {
            nVarV = nim.a.v(((r1) mVar).u(str2, str, hVar), new soi.a(29));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nVarV = nim.a.v(((r1) mVar).k(str2, str, hVar), new soi.a(26));
        }
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(rd0.e.n(xam.a.h(new v(this, continuation, 1), nVarV), h0.f322473a)), null, null, new v(this, continuation, 2), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.s(new t0(this.f265309t.B(new soi.a(27)), 1), new soi.a(28), vkm.q.f290100b), new s9b.n(continuation, this, 9)), null, null, new v(this, continuation, 0), 3);
    }

    public final i I2() {
        return (i) zi0.c.I(((l) ((j2) this.f265309t.f22677a).getValue()).f265284a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265309t;
    }
}
