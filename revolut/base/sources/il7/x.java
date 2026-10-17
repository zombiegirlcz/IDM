package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f162130b;

    public /* synthetic */ x(int i, String str, Integer num) {
        if (3 != (i & 3)) {
            j1.f(v.f162128a.getDescriptor(), i, 3);
            throw null;
        }
        this.f162129a = str;
        this.f162130b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f162129a, xVar.f162129a) && Intrinsics.f(this.f162130b, xVar.f162130b);
    }

    public final int hashCode() {
        int iHashCode = this.f162129a.hashCode() * 31;
        Integer num = this.f162130b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public x(String label, Integer num) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f162129a = label;
        this.f162130b = num;
    }
}
