package l8k;

import do3.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f193003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193004b;

    public e(n user, String paymentLink) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        this.f193003a = user;
        this.f193004b = paymentLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f193003a, eVar.f193003a) && Intrinsics.f(this.f193004b, eVar.f193004b);
    }

    public final int hashCode() {
        return this.f193004b.hashCode() + (this.f193003a.hashCode() * 31);
    }
}
