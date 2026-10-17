package ti7;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f271429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f271430c;

    public c(d key, dj0.d moneyLimit, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(moneyLimit, "moneyLimit");
        this.f271428a = key;
        this.f271429b = moneyLimit;
        this.f271430c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f271428a == cVar.f271428a && Intrinsics.f(this.f271429b, cVar.f271429b) && Intrinsics.f(this.f271430c, cVar.f271430c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f271428a.hashCode() * 31, 31, this.f271429b);
        dj0.d dVar = this.f271430c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
