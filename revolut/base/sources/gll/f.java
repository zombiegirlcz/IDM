package gll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144730a;

    public f(String cardPIN) {
        Intrinsics.checkNotNullParameter(cardPIN, "cardPIN");
        this.f144730a = cardPIN;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f144730a, ((f) obj2).f144730a);
    }

    public final int hashCode() {
        return this.f144730a.hashCode();
    }
}
