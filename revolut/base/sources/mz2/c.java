package mz2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210574a;

    public c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f210574a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f210574a, ((c) obj2).f210574a);
    }

    public final int hashCode() {
        return this.f210574a.hashCode();
    }
}
