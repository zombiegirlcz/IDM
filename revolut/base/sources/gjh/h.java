package gjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount f144303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144304b;

    public h(WealthAccount account, boolean z) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f144303a = account;
        this.f144304b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f144303a, hVar.f144303a) && this.f144304b == hVar.f144304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144304b) + (this.f144303a.hashCode() * 31);
    }
}
