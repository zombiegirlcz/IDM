package oq9;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f227859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f227860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227861c;

    public w(x owner, dj0.d amount, boolean z) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f227859a = owner;
        this.f227860b = amount;
        this.f227861c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f227859a, wVar.f227859a) && Intrinsics.f(this.f227860b, wVar.f227860b) && this.f227861c == wVar.f227861c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227861c) + v7.c(this.f227859a.f227862a.hashCode() * 31, 31, this.f227860b);
    }
}
