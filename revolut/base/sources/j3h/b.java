package j3h;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f171190a;

    public b(c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f171190a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f171190a == ((b) obj2).f171190a;
    }

    public final int hashCode() {
        return this.f171190a.hashCode();
    }
}
