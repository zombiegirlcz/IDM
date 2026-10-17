package lck;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements dli.b {
    public final PlanGiftingSendConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cl3.a f193895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f193896q;

    public f(n stateMapper, PlanGiftingSendConfirmationScreenContract$InputData inputData, cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.o = inputData;
        this.f193895p = contactsInteractor;
        this.f193896q = mra.d.b(this, new c(new Data(null, null, true, 3, null), inputData.f102516a, inputData.f102517b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new l34.a(this, null, 16), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f193896q;
    }
}
