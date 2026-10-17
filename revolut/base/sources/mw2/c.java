package mw2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg1.g f209312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw2.a f209313c;

    public c(String tokenUniqueReference, jg1.g sharedWalletType, cw2.a legacyWalletType) {
        Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
        Intrinsics.checkNotNullParameter(sharedWalletType, "sharedWalletType");
        Intrinsics.checkNotNullParameter(legacyWalletType, "legacyWalletType");
        this.f209311a = tokenUniqueReference;
        this.f209312b = sharedWalletType;
        this.f209313c = legacyWalletType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f209311a, cVar.f209311a) && this.f209312b == cVar.f209312b && this.f209313c == cVar.f209313c;
    }

    public final int hashCode() {
        return this.f209313c.hashCode() + ((this.f209312b.hashCode() + (this.f209311a.hashCode() * 31)) * 31);
    }
}
