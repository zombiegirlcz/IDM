package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f322001b;

    public t(String queryParam, n selectedOption) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f322000a = queryParam;
        this.f322001b = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f322000a, tVar.f322000a) && Intrinsics.f(this.f322001b, tVar.f322001b);
    }

    public final int hashCode() {
        return this.f322001b.hashCode() + (this.f322000a.hashCode() * 31);
    }
}
