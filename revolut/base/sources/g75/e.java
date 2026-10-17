package g75;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f141112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f141113b;

    public e(Data disclaimer, Data loanDetails) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f141112a = disclaimer;
        this.f141113b = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f141112a, eVar.f141112a) && Intrinsics.f(this.f141113b, eVar.f141113b);
    }

    public final int hashCode() {
        return this.f141113b.hashCode() + (this.f141112a.hashCode() * 31);
    }
}
