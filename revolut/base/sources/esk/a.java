package esk;

import kotlin.jvm.internal.Intrinsics;
import uqk.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f128993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128994b;

    public a(g item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f128993a = item;
        this.f128994b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f128993a, aVar.f128993a) && this.f128994b == aVar.f128994b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128994b) + (this.f128993a.hashCode() * 31);
    }
}
