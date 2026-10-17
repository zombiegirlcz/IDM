package fqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f137236a;

    public i(a cardInputMethod) {
        Intrinsics.checkNotNullParameter(cardInputMethod, "cardInputMethod");
        this.f137236a = cardInputMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f137236a == ((i) obj2).f137236a;
    }

    public final int hashCode() {
        return this.f137236a.hashCode();
    }
}
