package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f188521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f188523c;

    public /* synthetic */ l0(int i, i0 i0Var, String str, Integer num) {
        if (1 != (i & 1)) {
            qlm.j1.f(j0.f188513a.getDescriptor(), i, 1);
            throw null;
        }
        this.f188521a = i0Var;
        if ((i & 2) == 0) {
            this.f188522b = null;
        } else {
            this.f188522b = str;
        }
        if ((i & 4) == 0) {
            this.f188523c = null;
        } else {
            this.f188523c = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f188521a, l0Var.f188521a) && Intrinsics.f(this.f188522b, l0Var.f188522b) && Intrinsics.f(this.f188523c, l0Var.f188523c);
    }

    public final int hashCode() {
        int iHashCode = this.f188521a.f188509a.hashCode() * 31;
        String str = this.f188522b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188523c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public l0(i0 imuCollection, String str, Integer num) {
        Intrinsics.checkNotNullParameter(imuCollection, "imuCollection");
        this.f188521a = imuCollection;
        this.f188522b = str;
        this.f188523c = num;
    }
}
