package leh;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194555a;

    public a(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f194555a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f194555a, ((a) obj2).f194555a);
    }

    public final int hashCode() {
        return this.f194555a.hashCode();
    }
}
