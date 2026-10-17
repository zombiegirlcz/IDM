package zp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f324116c;

    public f(String formattedValue, Integer num, String extractedValue) {
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        this.f324114a = formattedValue;
        this.f324115b = extractedValue;
        this.f324116c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f324114a, fVar.f324114a) && Intrinsics.f(this.f324115b, fVar.f324115b) && Intrinsics.f(this.f324116c, fVar.f324116c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f324114a.hashCode() * 31, 31, this.f324115b);
        Integer num = this.f324116c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
