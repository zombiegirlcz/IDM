package tu2;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f274522a;

    public c(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f274522a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f274522a, ((c) obj2).f274522a);
    }

    public final int hashCode() {
        return this.f274522a.hashCode();
    }
}
