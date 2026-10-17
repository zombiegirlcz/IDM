package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j8 {

    @NotNull
    public static final i8 Companion = new i8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153164b;

    public /* synthetic */ j8(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h8.f153130a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153163a = str;
        this.f153164b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj2;
        return Intrinsics.f(this.f153163a, j8Var.f153163a) && Intrinsics.f(this.f153164b, j8Var.f153164b);
    }

    public final int hashCode() {
        int iHashCode = this.f153163a.hashCode() * 31;
        String str = this.f153164b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public j8(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f153163a = code;
        this.f153164b = str;
    }
}
