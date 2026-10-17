package ih3;

import kotlin.jvm.internal.Intrinsics;
import zg3.k;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements hh3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f161289a;

    public a(k progressBlock) {
        Intrinsics.checkNotNullParameter(progressBlock, "progressBlock");
        this.f161289a = progressBlock;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161289a, ((a) obj2).f161289a);
    }

    public final int hashCode() {
        return this.f161289a.hashCode();
    }
}
