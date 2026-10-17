package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260815c;
    public final List d;

    public /* synthetic */ x0(int i, String str, String str2, String str3, List list) {
        if (13 != (i & 13)) {
            qlm.j1.f(v0.f260804a.getDescriptor(), i, 13);
            throw null;
        }
        this.f260813a = str;
        if ((i & 2) == 0) {
            this.f260814b = null;
        } else {
            this.f260814b = str2;
        }
        this.f260815c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f260813a, x0Var.f260813a) && Intrinsics.f(this.f260814b, x0Var.f260814b) && Intrinsics.f(this.f260815c, x0Var.f260815c) && Intrinsics.f(this.d, x0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f260813a.hashCode() * 31;
        String str = this.f260814b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f260815c);
    }
}
