package cci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23110a;

    public a(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f23110a = purposes;
    }

    @Override // cci.f
    public final List a() {
        return this.f23110a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f23110a, ((a) obj2).f23110a);
    }

    public final int hashCode() {
        return this.f23110a.hashCode();
    }
}
