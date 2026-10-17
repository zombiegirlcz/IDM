package s77;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f260543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f260545c;
    public final String d;

    public /* synthetic */ j(int i, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2) {
        if (15 != (i & 15)) {
            j1.f(h.f260542a.getDescriptor(), i, 15);
            throw null;
        }
        this.f260543a = bigDecimal;
        this.f260544b = str;
        this.f260545c = bigDecimal2;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f260543a, jVar.f260543a) && Intrinsics.f(this.f260544b, jVar.f260544b) && Intrinsics.f(this.f260545c, jVar.f260545c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260543a.hashCode() * 31, 31, this.f260544b);
        BigDecimal bigDecimal = this.f260545c;
        int iHashCode = (iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public j(BigDecimal current, String updatedAt, BigDecimal bigDecimal, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f260543a = current;
        this.f260544b = updatedAt;
        this.f260545c = bigDecimal;
        this.d = str;
    }
}
