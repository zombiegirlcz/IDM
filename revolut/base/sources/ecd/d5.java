package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d5 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124517c;

    public /* synthetic */ d5(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(b5.f124499a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124515a = str;
        this.f124516b = str2;
        this.f124517c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f124515a, d5Var.f124515a) && Intrinsics.f(this.f124516b, d5Var.f124516b) && Intrinsics.f(this.f124517c, d5Var.f124517c);
    }

    public final int hashCode() {
        String str = this.f124515a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f124516b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124517c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public d5(String str, String str2, String str3) {
        this.f124515a = str;
        this.f124516b = str2;
        this.f124517c = str3;
    }
}
