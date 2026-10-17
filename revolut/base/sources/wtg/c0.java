package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299946c;

    public /* synthetic */ c0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a0.f299940a.getDescriptor(), i, 7);
            throw null;
        }
        this.f299944a = str;
        this.f299945b = str2;
        this.f299946c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f299944a, c0Var.f299944a) && Intrinsics.f(this.f299945b, c0Var.f299945b) && Intrinsics.f(this.f299946c, c0Var.f299946c);
    }

    public final int hashCode() {
        int iHashCode = this.f299944a.hashCode() * 31;
        String str = this.f299945b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f299946c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
