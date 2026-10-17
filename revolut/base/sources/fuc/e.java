package fuc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138173a;

    public e(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f138173a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f138173a, ((e) obj2).f138173a);
    }

    public final int hashCode() {
        return this.f138173a.hashCode();
    }
}
