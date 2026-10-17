package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169689b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f169684a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169688a = str;
        this.f169689b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f169688a, rVar.f169688a) && Intrinsics.f(this.f169689b, rVar.f169689b);
    }

    public final int hashCode() {
        return this.f169689b.hashCode() + (this.f169688a.hashCode() * 31);
    }

    public r(String value, String deeplink) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f169688a = value;
        this.f169689b = deeplink;
    }
}
