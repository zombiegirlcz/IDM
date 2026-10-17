package zl9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323199a;

    public c(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        this.f323199a = passcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f323199a, ((c) obj2).f323199a);
    }

    public final int hashCode() {
        return this.f323199a.hashCode();
    }
}
