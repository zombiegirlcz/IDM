package ex2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f130341a;

    public d(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f130341a = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f130341a, ((d) obj2).f130341a);
    }

    public final int hashCode() {
        return this.f130341a.hashCode();
    }
}
