package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingTicketorContract$InputData f118565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118567c;

    public d4(c1 c1Var, b4 b4Var, ManualUnderwritingTicketorContract$InputData manualUnderwritingTicketorContract$InputData) {
        this.f118566b = c1Var;
        this.f118565a = manualUnderwritingTicketorContract$InputData;
        this.f118567c = e4m.b.b(new w3(c1Var, this, 1));
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
