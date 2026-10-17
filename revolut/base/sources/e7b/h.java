package e7b;

import cli.n;
import cli.y;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements e {
    public final CobrandedCardsTypeSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.f f123148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f123149q;

    public h(n stateMapper, CobrandedCardsTypeSelectionScreenContract$InputData inputData, r10.f subscribeActionHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subscribeActionHandler, "subscribeActionHandler");
        this.o = inputData;
        this.f123148p = subscribeActionHandler;
        this.f123149q = mra.d.b(this, d.f123146a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f123149q;
    }
}
