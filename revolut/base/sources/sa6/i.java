package sa6;

import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f261323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f261324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f261325c;

    public i(h charityTransactionsInteractor, CharityTransactionsParams charityTransactionsParams, wfm.j scheduler) {
        Intrinsics.checkNotNullParameter(charityTransactionsInteractor, "charityTransactionsInteractor");
        Intrinsics.checkNotNullParameter(charityTransactionsParams, "charityTransactionsParams");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f261323a = charityTransactionsInteractor;
        this.f261324b = j6.a.h("create(...)");
        this.f261325c = te0.w.y0(new qg7.k(this, 6, charityTransactionsParams, scheduler));
    }
}
