package lfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194838a;

    public b(String recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f194838a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f194838a, ((b) obj2).f194838a);
    }

    public final int hashCode() {
        return this.f194838a.hashCode();
    }
}
