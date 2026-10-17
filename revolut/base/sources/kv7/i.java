package kv7;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements dli.b {
    public final InsuranceEligibleCardsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eu7.b f189992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tr7.a f189993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f189994r;

    public i(n stateMapper, InsuranceEligibleCardsScreenContract$InputData inputData, eu7.b cardsInteractor, tr7.a copyToClipboardHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        this.o = inputData;
        this.f189992p = cardsInteractor;
        this.f189993q = copyToClipboardHelper;
        this.f189994r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f189992p.b(this.o.f76100a), null, null, new krc.h(this, null, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f189994r;
    }
}
