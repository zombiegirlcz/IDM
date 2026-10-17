package h6e;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f149628a;

    public c(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f149628a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f149628a, ((c) obj2).f149628a);
    }

    public final int hashCode() {
        return this.f149628a.hashCode();
    }
}
