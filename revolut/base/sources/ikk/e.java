package ikk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lha.k f161992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f161994c;

    public e(lha.k inviter, boolean z, Data subscription) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f161992a = inviter;
        this.f161993b = z;
        this.f161994c = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f161992a, eVar.f161992a) && this.f161993b == eVar.f161993b && Intrinsics.f(this.f161994c, eVar.f161994c);
    }

    public final int hashCode() {
        return this.f161994c.hashCode() + j6.a.c(this.f161992a.hashCode() * 31, 31, this.f161993b);
    }
}
