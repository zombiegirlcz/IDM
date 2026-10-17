package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23111a;

    public b(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23111a = purposes;
    }

    @Override // cci.f
    public final List a() {
        return this.f23111a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f23111a, ((b) obj2).f23111a);
    }

    public final int hashCode() {
        return this.f23111a.hashCode();
    }
}
