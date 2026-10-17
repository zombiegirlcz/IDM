package s63;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260111c;

    public c(List cards, boolean z, List disposableCardLimits) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(disposableCardLimits, "disposableCardLimits");
        this.f260109a = cards;
        this.f260110b = disposableCardLimits;
        this.f260111c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f260109a, cVar.f260109a) && Intrinsics.f(this.f260110b, cVar.f260110b) && this.f260111c == cVar.f260111c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260111c) + p.a.d(this.f260109a.hashCode() * 31, 31, this.f260110b);
    }
}
