package iel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f160814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f160816c;

    public t(u type, String asset, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f160814a = type;
        this.f160815b = asset;
        this.f160816c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f160814a == tVar.f160814a && Intrinsics.f(this.f160815b, tVar.f160815b) && Intrinsics.f(this.f160816c, tVar.f160816c);
    }

    public final int hashCode() {
        return this.f160816c.hashCode() + p.a.c(this.f160814a.hashCode() * 31, 31, this.f160815b);
    }
}
