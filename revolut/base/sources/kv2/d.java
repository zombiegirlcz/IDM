package kv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f189937a;

    public d(t61.g card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f189937a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f189937a, ((d) obj2).f189937a);
    }

    public final int hashCode() {
        return this.f189937a.hashCode();
    }
}
