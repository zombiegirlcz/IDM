package hjb;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hf7.d(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f152698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ncd.k f152700c;

    public w(double d5, String suffix, ncd.k interestRateType) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(interestRateType, "interestRateType");
        this.f152698a = d5;
        this.f152699b = suffix;
        this.f152700c = interestRateType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Double.compare(this.f152698a, wVar.f152698a) == 0 && Intrinsics.f(this.f152699b, wVar.f152699b) && this.f152700c == wVar.f152700c;
    }

    public final int hashCode() {
        return this.f152700c.hashCode() + p.a.c(Double.hashCode(this.f152698a) * 31, 31, this.f152699b);
    }

    public /* synthetic */ w(int i, double d5, String str, ncd.k kVar) {
        if (7 != (i & 7)) {
            j1.f(u.f152697a.getDescriptor(), i, 7);
            throw null;
        }
        this.f152698a = d5;
        this.f152699b = str;
        this.f152700c = kVar;
    }
}
