package hra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f154802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154803b;

    public c(String cardOwnerId, xi0.b recipientCurrency) {
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        this.f154802a = recipientCurrency;
        this.f154803b = cardOwnerId;
    }

    public final String a() {
        xi0.b bVar = this.f154802a;
        int length = bVar.f306286a.length();
        String str = bVar.f306286a;
        String str2 = this.f154803b;
        return length + "#" + str + str2.length() + "#" + str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154802a, cVar.f154802a) && Intrinsics.f(this.f154803b, cVar.f154803b);
    }

    public final int hashCode() {
        return this.f154803b.hashCode() + (this.f154802a.hashCode() * 31);
    }
}
