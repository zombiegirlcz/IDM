package crg;

import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreenContract$Input;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ypg.d f108385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f108386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f108387r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, DocumentAcceptanceScreenContract$Input inputData, ypg.d savingsDocumentsInteractor, a dialogMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f108385p = savingsDocumentsInteractor;
        this.f108386q = dialogMapper;
        this.f108387r = new e(inputData.f94796a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f108387r;
    }
}
