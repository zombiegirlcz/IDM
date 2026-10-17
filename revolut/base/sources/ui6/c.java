package ui6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280311a;

    public c(String clientName) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        this.f280311a = clientName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f280311a, ((c) obj2).f280311a);
    }

    public final int hashCode() {
        return this.f280311a.hashCode();
    }
}
