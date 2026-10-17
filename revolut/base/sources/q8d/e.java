package q8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243056a;

    public e(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f243056a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f243056a, ((e) obj2).f243056a);
    }

    public final int hashCode() {
        return this.f243056a.hashCode();
    }
}
