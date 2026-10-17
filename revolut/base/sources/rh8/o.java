package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f254361c;

    public o(String juniorId, String firstName, String walletId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f254359a = juniorId;
        this.f254360b = firstName;
        this.f254361c = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f254359a, oVar.f254359a) && Intrinsics.f(this.f254360b, oVar.f254360b) && Intrinsics.f(this.f254361c, oVar.f254361c);
    }

    public final int hashCode() {
        return this.f254361c.hashCode() + p.a.c(this.f254359a.hashCode() * 31, 31, this.f254360b);
    }
}
