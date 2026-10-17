package b6h;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12745c;
    public final boolean d;
    public final BigDecimal e;

    public /* synthetic */ c(int i, String str, String str2, String str3, boolean z, BigDecimal bigDecimal) {
        if (31 != (i & 31)) {
            j1.f(a.f12742a.getDescriptor(), i, 31);
            throw null;
        }
        this.f12743a = str;
        this.f12744b = str2;
        this.f12745c = str3;
        this.d = z;
        this.e = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f12743a, cVar.f12743a) && Intrinsics.f(this.f12744b, cVar.f12744b) && Intrinsics.f(this.f12745c, cVar.f12745c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f12743a.hashCode() * 31, 31, this.f12744b), 31, this.f12745c), 31, this.d);
    }
}
