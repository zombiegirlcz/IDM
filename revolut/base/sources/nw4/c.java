package nw4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f219766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f219767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f219768c;

    public c(dj0.d inputAmount, dj0.d pocketBalance, dj0.d creditCarBalance) {
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(creditCarBalance, "creditCarBalance");
        this.f219766a = inputAmount;
        this.f219767b = pocketBalance;
        this.f219768c = creditCarBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f219766a, cVar.f219766a) && Intrinsics.f(this.f219767b, cVar.f219767b) && Intrinsics.f(this.f219768c, cVar.f219768c);
    }

    public final int hashCode() {
        return this.f219768c.hashCode() + v7.c(this.f219766a.hashCode() * 31, 31, this.f219767b);
    }
}
