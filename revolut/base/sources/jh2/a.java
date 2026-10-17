package jh2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174109a;

    public a(String requestLinkId) {
        Intrinsics.checkNotNullParameter(requestLinkId, "requestLinkId");
        this.f174109a = requestLinkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f174109a, ((a) obj2).f174109a);
    }

    public final int hashCode() {
        return this.f174109a.hashCode();
    }
}
