package f1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131235b;

    public c(String cardId, int i) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f131234a = cardId;
        this.f131235b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f131234a, cVar.f131234a) && this.f131235b == cVar.f131235b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131235b) + (this.f131234a.hashCode() * 31);
    }
}
