package zib;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xib.a f322516a;

    public a(xib.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f322516a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f322516a, ((a) obj2).f322516a);
    }

    public final int hashCode() {
        return this.f322516a.f306318a.hashCode();
    }
}
