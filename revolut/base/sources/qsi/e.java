package qsi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f248860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248861b;

    public e(ArrayList outboundConfirmationRequired, List suspiciousTransactions) {
        Intrinsics.checkNotNullParameter(outboundConfirmationRequired, "outboundConfirmationRequired");
        Intrinsics.checkNotNullParameter(suspiciousTransactions, "suspiciousTransactions");
        this.f248860a = outboundConfirmationRequired;
        this.f248861b = suspiciousTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f248860a.equals(eVar.f248860a) && this.f248861b.equals(eVar.f248861b);
    }

    public final int hashCode() {
        return this.f248861b.hashCode() + (this.f248860a.hashCode() * 31);
    }
}
