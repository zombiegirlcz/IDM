package o63;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f222490a;

    public a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f222490a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f222490a, ((a) obj2).f222490a);
    }

    public final int hashCode() {
        return this.f222490a.hashCode();
    }
}
