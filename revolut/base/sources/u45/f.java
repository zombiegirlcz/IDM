package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDocumentsControllerContract$InputData f277111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277113c;

    public f(h hVar, r rVar, LoanDocumentsControllerContract$InputData loanDocumentsControllerContract$InputData) {
        this.f277111a = loanDocumentsControllerContract$InputData;
        this.f277112b = e4m.b.b(new e(hVar, this, 1, 0));
        this.f277113c = e4m.b.b(new e(hVar, this, 0, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
