package ss4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265298a;

    public s(String amountText) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        this.f265298a = amountText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f265298a, ((s) obj2).f265298a);
    }

    public final int hashCode() {
        return this.f265298a.hashCode();
    }
}
