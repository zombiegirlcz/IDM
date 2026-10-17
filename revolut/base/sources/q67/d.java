package q67;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242521a;

    public d(String gifUrl) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        this.f242521a = gifUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f242521a, ((d) obj2).f242521a);
    }

    public final int hashCode() {
        return this.f242521a.hashCode();
    }
}
