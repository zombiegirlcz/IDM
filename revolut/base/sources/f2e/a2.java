package f2e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f131533c = {yhm.j.c(yhm.k.PUBLICATION, new i(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131535b;

    public /* synthetic */ a2(int i, List list, String str) {
        if (1 != (i & 1)) {
            qlm.j1.f(y1.f131773a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131534a = list;
        if ((i & 2) == 0) {
            this.f131535b = null;
        } else {
            this.f131535b = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.f131534a, a2Var.f131534a) && Intrinsics.f(this.f131535b, a2Var.f131535b);
    }

    public final int hashCode() {
        int iHashCode = this.f131534a.hashCode() * 31;
        String str = this.f131535b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public a2(List instructions, String str) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f131534a = instructions;
        this.f131535b = str;
    }
}
