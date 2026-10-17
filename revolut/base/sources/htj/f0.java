package htj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155411b;

    public /* synthetic */ f0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d0.f155403a.getDescriptor(), i, 3);
            throw null;
        }
        this.f155410a = str;
        this.f155411b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f155410a, f0Var.f155410a) && Intrinsics.f(this.f155411b, f0Var.f155411b);
    }

    public final int hashCode() {
        String str = this.f155410a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f155411b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public f0(String str, String str2) {
        this.f155410a = str;
        this.f155411b = str2;
    }
}
