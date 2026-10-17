package q8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243057a;

    public f(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f243057a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f243057a, ((f) obj2).f243057a);
    }

    public final int hashCode() {
        return this.f243057a.hashCode();
    }
}
