package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276105a;

    public d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f276105a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f276105a, ((d) obj2).f276105a);
    }

    public final int hashCode() {
        return this.f276105a.hashCode();
    }
}
