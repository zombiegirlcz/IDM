package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23112a;

    public c(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23112a = purposes;
    }

    @Override // cci.f
    public final List a() {
        return this.f23112a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f23112a, ((c) obj2).f23112a);
    }

    public final int hashCode() {
        return this.f23112a.hashCode();
    }
}
