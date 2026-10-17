package eda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124959b;

    public a(List hidden, List visible) {
        Intrinsics.checkNotNullParameter(hidden, "hidden");
        Intrinsics.checkNotNullParameter(visible, "visible");
        this.f124958a = hidden;
        this.f124959b = visible;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f124958a, aVar.f124958a) && Intrinsics.f(this.f124959b, aVar.f124959b);
    }

    public final int hashCode() {
        return this.f124959b.hashCode() + (this.f124958a.hashCode() * 31);
    }
}
