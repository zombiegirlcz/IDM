package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23113a;

    public d(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23113a = purposes;
    }

    @Override // cci.f
    public final List a() {
        return this.f23113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f23113a, ((d) obj2).f23113a);
    }

    public final int hashCode() {
        return this.f23113a.hashCode();
    }
}
