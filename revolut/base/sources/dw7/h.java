package dw7;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements dli.b {
    public final CardClaimsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eu7.b f120344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tr7.a f120345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f120346r;

    public h(n stateMapper, CardClaimsScreenContract$InputData inputData, eu7.b cardsInteractor, tr7.a copyToClipboardHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        this.o = inputData;
        this.f120344p = cardsInteractor;
        this.f120345q = copyToClipboardHelper;
        this.f120346r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f120344p.b(this.o.f76152a), null, null, new dob.c(this, null, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f120346r;
    }
}
