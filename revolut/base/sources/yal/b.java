package yal;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Screen.SimpleConfirmation f312070a;

    public b(SuspiciousTransactionDialog.Screen.SimpleConfirmation screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f312070a = screen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312070a, ((b) obj2).f312070a);
    }

    public final int hashCode() {
        return this.f312070a.hashCode();
    }
}
