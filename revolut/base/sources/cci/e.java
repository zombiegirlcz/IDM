package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23114a;

    public e(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23114a = purposes;
    }

    @Override // cci.f
    public final List a() {
        return this.f23114a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f23114a, ((e) obj2).f23114a);
    }

    public final int hashCode() {
        return this.f23114a.hashCode();
    }
}
