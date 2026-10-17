package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3417c;
    public final v d;

    public /* synthetic */ o0(int i, String str, String str2, String str3, v vVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(m0.f3412a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3415a = str;
        this.f3416b = str2;
        this.f3417c = str3;
        this.d = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f3415a, o0Var.f3415a) && Intrinsics.f(this.f3416b, o0Var.f3416b) && Intrinsics.f(this.f3417c, o0Var.f3417c) && Intrinsics.f(this.d, o0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3415a.hashCode() * 31;
        String str = this.f3416b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3417c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public o0(String title, String str, String str2, v bottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f3415a = title;
        this.f3416b = str;
        this.f3417c = str2;
        this.d = bottomSheet;
    }
}
