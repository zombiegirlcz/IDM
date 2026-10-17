package p6b;

import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s5b.c;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements c {
    public final CobrandedCardsTerminationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f233247p;

    public b(CobrandedCardsTerminationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        p5f.c cVar = new p5f.c(this, 3);
        this.f233247p = d.a(this, CobrandedCardsTerminationFlowContract$Step.ValueReminder.f82507a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f233247p;
    }
}
