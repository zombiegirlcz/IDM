package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g3 {

    @NotNull
    public static final f3 Companion = new f3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294846c;

    public /* synthetic */ g3(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(e3.f294822a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294844a = str;
        this.f294845b = str2;
        this.f294846c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f294844a, g3Var.f294844a) && Intrinsics.f(this.f294845b, g3Var.f294845b) && Intrinsics.f(this.f294846c, g3Var.f294846c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294844a.hashCode() * 31, 31, this.f294845b);
        String str = this.f294846c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public g3(String title, String action, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f294844a = title;
        this.f294845b = action;
        this.f294846c = str;
    }
}
