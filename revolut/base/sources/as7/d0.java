package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8832c;

    public /* synthetic */ d0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(b0.f8825a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8830a = str;
        this.f8831b = str2;
        this.f8832c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f8830a, d0Var.f8830a) && Intrinsics.f(this.f8831b, d0Var.f8831b) && Intrinsics.f(this.f8832c, d0Var.f8832c);
    }

    public final int hashCode() {
        String str = this.f8830a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f8831b);
        String str2 = this.f8832c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public d0(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f8830a = str;
        this.f8831b = title;
        this.f8832c = str2;
    }
}
