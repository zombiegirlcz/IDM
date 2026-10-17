package ip4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreenContract$InputData;
import ip0.w10;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements j {
    public final al4.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AdditionalCardsCardholderDetailsScreenContract$InputData f167660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f167661q;

    public l(al4.d creditCardAdditionalCardholdersInteractor, AdditionalCardsCardholderDetailsScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardAdditionalCardholdersInteractor;
        this.f167660p = inputData;
        this.f167661q = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        AdditionalCardsCardholderDetailsScreenContract$InputData additionalCardsCardholderDetailsScreenContract$InputData = this.f167660p;
        String facilityId = additionalCardsCardholderDetailsScreenContract$InputData.f69006b;
        String cardholderId = additionalCardsCardholderDetailsScreenContract$InputData.f69005a;
        om4.l lVar = (om4.l) this.o;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.e eVar = lVar.f226624a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = eVar.f.b(new cp4.e(facilityId, cardholderId), loadingStrategy);
        String facilityId2 = additionalCardsCardholderDetailsScreenContract$InputData.f69006b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.e eVar2 = lVar.f226624a;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, q.q(nim.a.v(u0.m(dVarB, eVar2.f116636g.b(new cp4.c(facilityId2, cardholderId), loadingStrategy)), new w10(this, 24))), null, new ibg.g(this, null, 23), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f167661q;
    }
}
