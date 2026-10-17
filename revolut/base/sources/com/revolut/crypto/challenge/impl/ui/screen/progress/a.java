package com.revolut.crypto.challenge.impl.ui.screen.progress;

import aii.e0;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.crypto.challenge.api.R$string;
import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressContract$ModalStep;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.youTransactor.uCube.rpc.Constants;
import e11.d;
import i4b.f;
import k11.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import m11.e;
import oki.h;
import vkm.j2;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements e {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f60123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f60124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ajk.f f60125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f60127t;

    public a(d tierClauseMapper, f challengeRewardsInteractor, b cryptoChallengeStorageInteractor, ajk.f pricingPlanNavigationCommandsProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(tierClauseMapper, "tierClauseMapper");
        Intrinsics.checkNotNullParameter(challengeRewardsInteractor, "challengeRewardsInteractor");
        Intrinsics.checkNotNullParameter(cryptoChallengeStorageInteractor, "cryptoChallengeStorageInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = tierClauseMapper;
        this.f60123p = challengeRewardsInteractor;
        this.f60124q = cryptoChallengeStorageInteractor;
        this.f60125r = pricingPlanNavigationCommandsProvider;
        this.f60126s = hx7.e.a(this, new c(this, 21));
        this.f60127t = mra.d.b(this, new m11.f(new Data(null, null, false, 7, null), (f11.c) wp5.y.t(f11.c.class, cryptoChallengeStorageInteractor.f180076a, "LAST_SHOWN_TIER_KEY")), stateMapper, null, false, 12);
    }

    public final void I2(m11.d parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof m11.c) {
            C1(new e0(u0.c(new CryptoRemittanceKompotFeatureConfig.CurrencyPicker(new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R$string.crypto_challenge_progress_receive_screen_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.Deposit.f70938a, (pj5.a) null, (TextLocalisedClause) null, false, false, Constants.TAG_F5), null)), null, false, 6));
            return;
        }
        if (parcel instanceof m11.a) {
            h.v2(this.f60126s, new CryptoChallengeProgressContract$ModalStep.ConfirmClaim(((m11.a) parcel).f201172a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(parcel instanceof m11.b)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(u0.b(this.f60125r.b()));
        }
    }

    public final void J2() {
        f11.b bVar = (f11.b) ((m11.f) ((j2) this.f60127t.f22677a).getValue()).f201175a.getContent();
        if (bVar != null) {
            h.v2(this.f60126s, new CryptoChallengeProgressContract$ModalStep.Conditions(bVar.f131162b), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60126s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, ((g11.b) this.f60123p.f158330b).e.b(Unit.f186387a, w4l.h.f294642c), null, new lph.h(this, null, 16), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f60127t;
    }
}
