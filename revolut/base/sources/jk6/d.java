package jk6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175106a;

    public d(String clientName) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        this.f175106a = clientName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f175106a, ((d) obj2).f175106a);
    }

    public final int hashCode() {
        return this.f175106a.hashCode();
    }
}
