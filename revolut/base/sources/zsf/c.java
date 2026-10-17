package zsf;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324913a;

    public c(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f324913a = body;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f324913a, ((c) obj2).f324913a);
    }

    public final int hashCode() {
        return this.f324913a.hashCode();
    }
}
