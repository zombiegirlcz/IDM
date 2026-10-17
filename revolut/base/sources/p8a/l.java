package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixApmRecipientWarningContract$InputData f234010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234012c;

    public l(d0 d0Var, u0 u0Var, PixApmRecipientWarningContract$InputData pixApmRecipientWarningContract$InputData) {
        this.f234010a = pixApmRecipientWarningContract$InputData;
        int i = 29;
        this.f234011b = e4m.b.b(new p12.f0(d0Var, this, 1, i));
        this.f234012c = e4m.b.b(new p12.f0(d0Var, this, 0, i));
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
