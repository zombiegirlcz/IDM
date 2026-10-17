package wte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299931a;

    public a(String authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f299931a = authUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f299931a, ((a) obj2).f299931a);
    }

    public final int hashCode() {
        return this.f299931a.hashCode();
    }
}
