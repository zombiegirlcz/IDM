package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.f f283939b;

    public o(String code, jq9.f paymentItem) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f283938a = code;
        this.f283939b = paymentItem;
    }

    @Override // ux9.t
    public final jq9.b b() {
        return this.f283939b;
    }

    public final String c() {
        return this.f283938a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f283938a, oVar.f283938a) && this.f283939b.equals(oVar.f283939b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(0, (this.f283939b.f177500a.hashCode() + (this.f283938a.hashCode() * 31)) * 31, 31);
    }
}
