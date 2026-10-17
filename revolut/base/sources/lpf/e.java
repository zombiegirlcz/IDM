package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonForTransferSummaryScreenContract$InputData f199019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f199020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199021c;

    public e(i iVar, c cVar, ReasonForTransferSummaryScreenContract$InputData reasonForTransferSummaryScreenContract$InputData) {
        this.f199019a = reasonForTransferSummaryScreenContract$InputData;
        int i = 4;
        this.f199020b = e4m.b.b(new ljl.y(this, 1, i));
        this.f199021c = e4m.b.b(new ljl.y(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
