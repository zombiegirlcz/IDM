package bk4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f16259c;

    public g(String accountNumber, String sortCode, f origin) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f16257a = accountNumber;
        this.f16258b = sortCode;
        this.f16259c = origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f16257a, gVar.f16257a) && Intrinsics.f(this.f16258b, gVar.f16258b) && this.f16259c == gVar.f16259c;
    }

    public final int hashCode() {
        return this.f16259c.hashCode() + p.a.c(this.f16257a.hashCode() * 31, 31, this.f16258b);
    }
}
