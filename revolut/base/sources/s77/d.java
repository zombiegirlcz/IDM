package s77;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f260535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f260537c;
    public final String d;

    public /* synthetic */ d(int i, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2) {
        if (15 != (i & 15)) {
            j1.f(b.f260529a.getDescriptor(), i, 15);
            throw null;
        }
        this.f260535a = bigDecimal;
        this.f260536b = str;
        this.f260537c = bigDecimal2;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f260535a, dVar.f260535a) && Intrinsics.f(this.f260536b, dVar.f260536b) && Intrinsics.f(this.f260537c, dVar.f260537c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260535a.hashCode() * 31, 31, this.f260536b);
        BigDecimal bigDecimal = this.f260537c;
        int iHashCode = (iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public d(BigDecimal current, String updatedAt, BigDecimal bigDecimal, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f260535a = current;
        this.f260536b = updatedAt;
        this.f260537c = bigDecimal;
        this.d = str;
    }
}
