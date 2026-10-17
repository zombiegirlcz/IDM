package il9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f162190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162191c;

    public /* synthetic */ l(long j2, long j3, int i, String str) {
        if (7 != (i & 7)) {
            j1.f(j.f162188a.getDescriptor(), i, 7);
            throw null;
        }
        this.f162189a = str;
        this.f162190b = j2;
        this.f162191c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f162189a, lVar.f162189a) && this.f162190b == lVar.f162190b && this.f162191c == lVar.f162191c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f162191c) + a0.d.c(this.f162189a.hashCode() * 31, 31, this.f162190b);
    }
}
