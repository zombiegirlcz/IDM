package xal;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Screen.Cancel f303904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303905b;

    public c(SuspiciousTransactionDialog.Screen.Cancel screen, String str) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f303904a = screen;
        this.f303905b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f303904a, cVar.f303904a) && Intrinsics.f(this.f303905b, cVar.f303905b);
    }

    public final int hashCode() {
        int iHashCode = this.f303904a.hashCode() * 31;
        String str = this.f303905b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
