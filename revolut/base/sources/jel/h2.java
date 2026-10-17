package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f173468c;
    public final String d;
    public final i2 e;

    public h2(BigDecimal start, BigDecimal end2, j2 type, String description, i2 i2Var) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f173466a = start;
        this.f173467b = end2;
        this.f173468c = type;
        this.d = description;
        this.e = i2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f173466a, h2Var.f173466a) && Intrinsics.f(this.f173467b, h2Var.f173467b) && this.f173468c == h2Var.f173468c && Intrinsics.f(this.d, h2Var.d) && Intrinsics.f(this.e, h2Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f173468c.hashCode() + t61.a.d(this.f173467b, this.f173466a.hashCode() * 31, 31)) * 31, 31, this.d);
        i2 i2Var = this.e;
        return iC + (i2Var == null ? 0 : i2Var.hashCode());
    }
}
