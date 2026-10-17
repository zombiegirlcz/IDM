package km6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185724a;

    public c(String authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f185724a = authUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f185724a, ((c) obj2).f185724a);
    }

    public final int hashCode() {
        return this.f185724a.hashCode();
    }
}
