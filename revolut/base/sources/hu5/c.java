package hu5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155558b;

    public c(String userId, String baseCurrency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f155557a = userId;
        this.f155558b = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f155557a, cVar.f155557a) && Intrinsics.f(this.f155558b, cVar.f155558b);
    }

    public final int hashCode() {
        return this.f155558b.hashCode() + (this.f155557a.hashCode() * 31);
    }
}
