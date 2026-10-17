package pz2;

import cli.y;
import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f240880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f240881q;

    public n(cli.n stateMapper, CardSetLimitScreenContract$InputData inputData, w80.b amountFormatter, l93.f cardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        this.o = amountFormatter;
        this.f240880p = cardsInteractor;
        CardLimitSetData cardLimitSetData = inputData.f64835a;
        this.f240881q = mra.d.b(this, new h(cardLimitSetData, I2(cardLimitSetData)), stateMapper, null, false, 12);
    }

    public static boolean I2(CardLimitSetData cardLimitSetData) {
        if (cardLimitSetData.f64823b.k()) {
            return false;
        }
        long j2 = cardLimitSetData.d.f115082a;
        return j2 == 0 || j2 >= cardLimitSetData.f64823b.f115082a;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f240881q;
    }
}
