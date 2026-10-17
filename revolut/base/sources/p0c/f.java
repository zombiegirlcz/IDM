package p0c;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231502a;

    public f(String selectedTransactionId) {
        Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
        this.f231502a = selectedTransactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f231502a, ((f) obj2).f231502a);
    }

    public final int hashCode() {
        return this.f231502a.hashCode();
    }
}
