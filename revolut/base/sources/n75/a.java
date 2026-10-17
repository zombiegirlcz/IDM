package n75;

import kotlin.jvm.internal.Intrinsics;
import q35.x;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f212996a;

    public a(x details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f212996a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f212996a, ((a) obj2).f212996a);
    }

    public final int hashCode() {
        return this.f212996a.hashCode();
    }
}
