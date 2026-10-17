package cc9;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f22967a;

    public a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f22967a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f22967a, ((a) obj2).f22967a);
    }

    public final int hashCode() {
        return this.f22967a.hashCode();
    }
}
