package r9a;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements dli.b {
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PixAuthorisationTransactionLimitScreenContract$InputData f252554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ryc.a f252555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f252556r;

    public k(n stateMapper, w80.b amountFormatter, PixAuthorisationTransactionLimitScreenContract$InputData inputData, ryc.a authorisationRequestInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(authorisationRequestInteractor, "authorisationRequestInteractor");
        this.o = amountFormatter;
        this.f252554p = inputData;
        this.f252555q = authorisationRequestInteractor;
        dj0.d dVar = inputData.f80601b;
        if (dVar == null) {
            dj0.d.Companion.getClass();
            dVar = dj0.d.e;
        }
        dj0.d dVar2 = inputData.f80601b;
        if (dVar2 == null) {
            dj0.d.Companion.getClass();
            dVar2 = dj0.d.e;
        }
        dj0.d dVar3 = inputData.f80602c;
        if (dVar3 == null) {
            dj0.d.Companion.getClass();
            dVar3 = dj0.d.e;
        }
        this.f252556r = mra.d.b(this, new d(dVar2, dVar, dVar3), stateMapper, null, false, 12);
    }

    public static final void I2(k kVar) {
        kVar.getClass();
        kVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f252556r;
    }
}
