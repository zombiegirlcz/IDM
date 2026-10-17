package m73;

import cli.k;
import cli.y;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h implements dli.b {
    public final AutoRenewalDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f203304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f203305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f203306r;

    public e(g stateMapper, AutoRenewalDialogContract$InputData inputData, s revolutCardsInteractor, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.o = inputData;
        this.f203304p = revolutCardsInteractor;
        this.f203305q = wp5.y.u(uuidUtils, "toString(...)");
        this.f203306r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203306r;
    }
}
