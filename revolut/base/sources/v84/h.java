package v84;

import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends jki.g implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DebtDetailsScreenContract$InputData f286713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f286714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f286715r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DebtDetailsScreenContract$InputData inputData, j60.a bottomDialogExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f286713p = inputData;
        this.f286714q = bottomDialogExtension;
        this.f286715r = new c(inputData.f67440a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f286715r;
    }
}
