package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f322291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f322292b;

    public j(h93.f0 card, k state) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f322291a = card;
        this.f322292b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f322291a, jVar.f322291a) && this.f322292b == jVar.f322292b;
    }

    public final int hashCode() {
        return this.f322292b.hashCode() + (this.f322291a.hashCode() * 31);
    }
}
