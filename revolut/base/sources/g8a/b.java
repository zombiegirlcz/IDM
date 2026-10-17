package g8a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f141300a;

    public b(ArrayList recurringPayments) {
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.f141300a = recurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f141300a.equals(((b) obj2).f141300a);
    }

    public final int hashCode() {
        return this.f141300a.hashCode();
    }
}
