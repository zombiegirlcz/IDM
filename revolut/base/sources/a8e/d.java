package a8e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2186a;

    public d(List currencyType) {
        Intrinsics.checkNotNullParameter(currencyType, "currencyType");
        this.f2186a = currencyType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f2186a, ((d) obj2).f2186a);
    }

    public final int hashCode() {
        return this.f2186a.hashCode();
    }
}
