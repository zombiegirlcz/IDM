package wal;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f295974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Screen.RiskAgreement f295975c;

    public c(boolean z, boolean z3, SuspiciousTransactionDialog.Screen.RiskAgreement screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f295973a = z;
        this.f295974b = z3;
        this.f295975c = screen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f295973a == cVar.f295973a && this.f295974b == cVar.f295974b && Intrinsics.f(this.f295975c, cVar.f295975c);
    }

    public final int hashCode() {
        return this.f295975c.hashCode() + j6.a.c(Boolean.hashCode(this.f295973a) * 31, 31, this.f295974b);
    }
}
