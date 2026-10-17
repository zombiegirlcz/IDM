package lb9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193602a;

    public d(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        this.f193602a = passcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f193602a, ((d) obj2).f193602a);
    }

    public final int hashCode() {
        return this.f193602a.hashCode();
    }
}
