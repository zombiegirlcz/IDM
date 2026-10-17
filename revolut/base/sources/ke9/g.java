package ke9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183056a;

    public g(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        this.f183056a = passcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f183056a, ((g) obj2).f183056a);
    }

    public final int hashCode() {
        return this.f183056a.hashCode();
    }
}
