package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h7 {

    @NotNull
    public static final g7 Companion = new g7();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117704c;

    public /* synthetic */ h7(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(f7.f117677a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117702a = str;
        this.f117703b = list;
        this.f117704c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj2;
        return Intrinsics.f(this.f117702a, h7Var.f117702a) && Intrinsics.f(this.f117703b, h7Var.f117703b) && Intrinsics.f(this.f117704c, h7Var.f117704c);
    }

    public final int hashCode() {
        return this.f117704c.hashCode() + p.a.d(this.f117702a.hashCode() * 31, 31, this.f117703b);
    }
}
