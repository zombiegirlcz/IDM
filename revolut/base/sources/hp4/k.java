package hp4;

import al4.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_account_info.AdditionalCardsCardholderAccountInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.m4;
import om4.x2;
import vkm.q;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements h {
    public final al4.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f154455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f154456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mt8.d f154457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final an4.e f154458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m4 f154459t;
    public final AdditionalCardsCardholderAccountInfoScreenContract$InputData u;
    public final y v;

    public k(al4.d creditCardAdditionalCardholdersInteractor, n creditCardInteractor, l93.f cardsInteractor, mt8.d kycInteractor, an4.e navigationFactory, m4 familyCreditCardWalletInteractor, AdditionalCardsCardholderAccountInfoScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardAdditionalCardholdersInteractor;
        this.f154455p = creditCardInteractor;
        this.f154456q = cardsInteractor;
        this.f154457r = kycInteractor;
        this.f154458s = navigationFactory;
        this.f154459t = familyCreditCardWalletInteractor;
        this.u = inputData;
        this.v = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        Flow flowH = xam.a.h(new j(this, null, 1), this.f154459t.a());
        AdditionalCardsCardholderAccountInfoScreenContract$InputData additionalCardsCardholderAccountInfoScreenContract$InputData = this.u;
        String str = additionalCardsCardholderAccountInfoScreenContract$InputData.f69004a;
        om4.l lVar = (om4.l) this.o;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = lVar.b(str, hVar);
        vkm.d dVarB2 = rd0.e.b(this.f154457r.a(false));
        yji.l.b1(this, q.q(rd0.e.n(nim.a.u(new d4f.m(2, 26, null), u0.m(u0.i(flowH, dVarB, dVarB2), ((x2) this.f154455p).h(additionalCardsCardholderAccountInfoScreenContract$InputData.f69004a, hVar))), h0.f322473a)), null, new j(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
