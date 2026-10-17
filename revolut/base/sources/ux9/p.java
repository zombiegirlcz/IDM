package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.i f283940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.h f283941b;

    public p(zm3.i contact, jq9.h paymentItem) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283940a = contact;
        this.f283941b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283941b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f283940a, pVar.f283940a) && this.f283941b.equals(pVar.f283941b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, m72.b.f(this.f283941b.f177502a, this.f283940a.hashCode() * 31, 31), 31);
    }
}
