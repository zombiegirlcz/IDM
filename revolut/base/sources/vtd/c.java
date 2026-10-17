package vtd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f292101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f292102c;
    public final dj0.d d;

    public c(String pocketId, dj0.d balance, Integer num, dj0.d fiatBalance) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(fiatBalance, "fiatBalance");
        this.f292100a = pocketId;
        this.f292101b = balance;
        this.f292102c = num;
        this.d = fiatBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292100a, cVar.f292100a) && Intrinsics.f(this.f292101b, cVar.f292101b) && Intrinsics.f(this.f292102c, cVar.f292102c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f292100a.hashCode() * 31, 31, this.f292101b);
        Integer num = this.f292102c;
        return this.d.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(dj0.d dVar, Integer num, String str) {
        this(str, dVar, num, dj0.d.d);
        dj0.d.Companion.getClass();
    }
}
