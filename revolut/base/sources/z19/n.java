package z19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f318787a;

    public n(ArrayList cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f318787a = cards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f318787a.equals(((n) obj2).f318787a);
    }

    public final int hashCode() {
        return this.f318787a.hashCode();
    }
}
