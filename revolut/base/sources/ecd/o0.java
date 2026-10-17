package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124634c;
    public final f0 d;

    public /* synthetic */ o0(int i, String str, String str2, String str3, f0 f0Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(m0.f124614a.getDescriptor(), i, 15);
            throw null;
        }
        this.f124632a = str;
        this.f124633b = str2;
        this.f124634c = str3;
        this.d = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f124632a, o0Var.f124632a) && Intrinsics.f(this.f124633b, o0Var.f124633b) && Intrinsics.f(this.f124634c, o0Var.f124634c) && Intrinsics.f(this.d, o0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f124632a.hashCode() * 31;
        String str = this.f124633b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124634c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f0 f0Var = this.d;
        return iHashCode3 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public o0(String title, String str, String str2, f0 f0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124632a = title;
        this.f124633b = str;
        this.f124634c = str2;
        this.d = f0Var;
    }
}
