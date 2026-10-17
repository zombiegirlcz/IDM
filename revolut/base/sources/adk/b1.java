package adk;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f3364c = {null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3366b;

    public /* synthetic */ b1(Map map, String str, int i) {
        if (1 != (i & 1)) {
            qlm.j1.f(z0.f3458a.getDescriptor(), i, 1);
            throw null;
        }
        this.f3365a = str;
        if ((i & 2) == 0) {
            this.f3366b = zhm.r0.g();
        } else {
            this.f3366b = map;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f3365a, b1Var.f3365a) && Intrinsics.f(this.f3366b, b1Var.f3366b);
    }

    public final int hashCode() {
        return this.f3366b.hashCode() + (this.f3365a.hashCode() * 31);
    }
}
