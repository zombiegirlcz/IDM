package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229698c;

    public /* synthetic */ v0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(t0.f229687a.getDescriptor(), i, 7);
            throw null;
        }
        this.f229696a = str;
        this.f229697b = str2;
        this.f229698c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f229696a, v0Var.f229696a) && Intrinsics.f(this.f229697b, v0Var.f229697b) && Intrinsics.f(this.f229698c, v0Var.f229698c);
    }

    public final int hashCode() {
        int iHashCode = this.f229696a.hashCode() * 31;
        String str = this.f229697b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229698c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public v0(String text, String str, String str2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f229696a = text;
        this.f229697b = str;
        this.f229698c = str2;
    }
}
