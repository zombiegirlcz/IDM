package svi;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f265952c;

    public n(int i, int i2, Instant expirationDate) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f265950a = i;
        this.f265951b = i2;
        this.f265952c = expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f265950a == nVar.f265950a && this.f265951b == nVar.f265951b && Intrinsics.f(this.f265952c, nVar.f265952c);
    }

    public final int hashCode() {
        return this.f265952c.hashCode() + j6.a.b(this.f265951b, Integer.hashCode(this.f265950a) * 31, 31);
    }
}
