package pt4;

import al4.o;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements dli.b {
    public final CreditCardLimitIncreasePreferenceContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f239610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f239611q;

    public h(CreditCardLimitIncreasePreferenceContract$InputData inputData, o creditCardLimitIncreaseInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseInteractor, "creditCardLimitIncreaseInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f239610p = creditCardLimitIncreaseInteractor;
        xp3.d dVar = inputData.f69538b;
        this.f239611q = mra.d.b(this, new a(dVar, dVar, inputData.f69539c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f239611q;
    }
}
