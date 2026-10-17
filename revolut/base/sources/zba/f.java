package zba;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f320855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f320856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f320857c;

    public f(dj0.d amount, dj0.d balance, String description) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f320855a = amount;
        this.f320856b = balance;
        this.f320857c = description;
    }

    public static f a(f fVar, dj0.d amount, dj0.d balance, String description, int i) {
        if ((i & 1) != 0) {
            amount = fVar.f320855a;
        }
        if ((i & 2) != 0) {
            balance = fVar.f320856b;
        }
        if ((i & 4) != 0) {
            description = fVar.f320857c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(description, "description");
        return new f(amount, balance, description);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f320855a, fVar.f320855a) && Intrinsics.f(this.f320856b, fVar.f320856b) && Intrinsics.f(this.f320857c, fVar.f320857c);
    }

    public final int hashCode() {
        return this.f320857c.hashCode() + v7.c(this.f320855a.hashCode() * 31, 31, this.f320856b);
    }
}
