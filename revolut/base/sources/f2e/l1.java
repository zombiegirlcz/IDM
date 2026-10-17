package f2e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f131648c = {null, yhm.j.c(yhm.k.PUBLICATION, new i(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4 f131649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131650b;

    public /* synthetic */ l1(int i, q4 q4Var, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(j1.f131631a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131649a = q4Var;
        this.f131650b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f131649a, l1Var.f131649a) && Intrinsics.f(this.f131650b, l1Var.f131650b);
    }

    public final int hashCode() {
        return this.f131650b.hashCode() + (this.f131649a.hashCode() * 31);
    }
}
