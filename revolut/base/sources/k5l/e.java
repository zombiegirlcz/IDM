package k5l;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181571c;
    public final q d;

    public e(String walletId, String firstName, List transactions, q extraData) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f181569a = walletId;
        this.f181570b = firstName;
        this.f181571c = transactions;
        this.d = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f181569a, eVar.f181569a) && Intrinsics.f(this.f181570b, eVar.f181570b) && Intrinsics.f(this.f181571c, eVar.f181571c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f181569a.hashCode() * 31, 31, this.f181570b), 31, this.f181571c);
    }
}
