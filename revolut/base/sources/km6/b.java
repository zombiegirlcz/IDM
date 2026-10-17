package km6;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185723a;

    public b(String authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f185723a = authUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f185723a, ((b) obj2).f185723a);
    }

    public final int hashCode() {
        return this.f185723a.hashCode();
    }

    public b() {
        this("");
    }
}
