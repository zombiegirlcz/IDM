package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294984c;

    public /* synthetic */ q1(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(o1.f294961a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294982a = str;
        this.f294983b = str2;
        this.f294984c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f294982a, q1Var.f294982a) && Intrinsics.f(this.f294983b, q1Var.f294983b) && Intrinsics.f(this.f294984c, q1Var.f294984c);
    }

    public final int hashCode() {
        int iHashCode = this.f294982a.hashCode() * 31;
        String str = this.f294983b;
        return this.f294984c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
