package lal;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientContract$InputData;
import java.util.Set;
import l9f.z;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousRecipientContract$InputData f193448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193450c;

    public i(k kVar, SuspiciousRecipientContract$InputData suspiciousRecipientContract$InputData) {
        this.f193448a = suspiciousRecipientContract$InputData;
        int i = 5;
        this.f193449b = e4m.b.b(new z(kVar, this, 1, i));
        this.f193450c = e4m.b.b(new z(kVar, this, 0, i));
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
