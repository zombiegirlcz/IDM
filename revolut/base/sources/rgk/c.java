package rgk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f254202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f254203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f254204c;
    public final Function0 d;

    public c(Function2 openModal, Function0 closeBeforeSuccessStatusSheet, phk.o oVar, int i) {
        Function0 onPlanChangeCommitted = oVar;
        onPlanChangeCommitted = (i & 8) != 0 ? new re3.d(7) : onPlanChangeCommitted;
        Intrinsics.checkNotNullParameter(openModal, "openModal");
        Intrinsics.checkNotNullParameter(closeBeforeSuccessStatusSheet, "closePresentation");
        Intrinsics.checkNotNullParameter(closeBeforeSuccessStatusSheet, "closeBeforeSuccessStatusSheet");
        Intrinsics.checkNotNullParameter(onPlanChangeCommitted, "onPlanChangeCommitted");
        this.f254202a = openModal;
        this.f254203b = closeBeforeSuccessStatusSheet;
        this.f254204c = closeBeforeSuccessStatusSheet;
        this.d = onPlanChangeCommitted;
    }
}
