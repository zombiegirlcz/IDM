package x9f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f303703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f303704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f303705c;

    public h(BigDecimal bigDecimal, boolean z, boolean z3) {
        this.f303703a = bigDecimal;
        this.f303704b = z;
        this.f303705c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f303703a, hVar.f303703a) && this.f303704b == hVar.f303704b && this.f303705c == hVar.f303705c;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f303703a;
        return Boolean.hashCode(this.f303705c) + j6.a.c((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31, 31, this.f303704b);
    }
}
