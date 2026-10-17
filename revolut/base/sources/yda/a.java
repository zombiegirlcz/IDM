package yda;

import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f312667b;

    public a(String walletId, l pocketType) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f312666a = walletId;
        this.f312667b = pocketType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f312666a, aVar.f312666a) && this.f312667b == aVar.f312667b;
    }

    public final int hashCode() {
        return this.f312667b.hashCode() + (this.f312666a.hashCode() * 31);
    }
}
