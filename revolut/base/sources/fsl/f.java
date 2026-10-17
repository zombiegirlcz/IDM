package fsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f137726a;

    public f(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f137726a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f137726a, ((f) obj2).f137726a);
    }

    public final int hashCode() {
        return this.f137726a.hashCode();
    }
}
