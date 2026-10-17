package mg1;

import cli.j;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f205138a;

    public c(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f205138a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f205138a, ((c) obj2).f205138a);
    }

    public final int hashCode() {
        return this.f205138a.hashCode();
    }
}
