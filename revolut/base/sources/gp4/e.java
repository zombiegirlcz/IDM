package gp4;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements dli.b {
    public final AdditionalCardsCardholderCancelInvitationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.d f145251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f145252q;

    public e(n stateMapper, AdditionalCardsCardholderCancelInvitationScreenContract$InputData inputData, al4.d creditCardAdditionalCardholdersInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        this.o = inputData;
        this.f145251p = creditCardAdditionalCardholdersInteractor;
        this.f145252q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f145252q;
    }
}
