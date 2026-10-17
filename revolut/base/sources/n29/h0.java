package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211472c;

    public /* synthetic */ h0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(f0.f211467a.getDescriptor(), i, 7);
            throw null;
        }
        this.f211470a = str;
        this.f211471b = str2;
        this.f211472c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f211470a, h0Var.f211470a) && Intrinsics.f(this.f211471b, h0Var.f211471b) && Intrinsics.f(this.f211472c, h0Var.f211472c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211470a.hashCode() * 31, 31, this.f211471b);
        String str = this.f211472c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public h0(String title, String value, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f211470a = title;
        this.f211471b = value;
        this.f211472c = str;
    }
}
