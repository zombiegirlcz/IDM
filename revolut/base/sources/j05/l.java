package j05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f169962c;

    public /* synthetic */ l(String str, int i, int i2, Integer num) {
        if (7 != (i & 7)) {
            j1.f(j.f169959a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169960a = i2;
        this.f169961b = str;
        this.f169962c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f169960a == lVar.f169960a && Intrinsics.f(this.f169961b, lVar.f169961b) && Intrinsics.f(this.f169962c, lVar.f169962c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f169960a) * 31;
        String str = this.f169961b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f169962c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
