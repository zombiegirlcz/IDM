package wxe;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300915c;
    public final TopUpMethodsContext d;

    public r(String accountDetailsId, String originalAccountName, String customLabel, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(accountDetailsId, "accountDetailsId");
        Intrinsics.checkNotNullParameter(originalAccountName, "originalAccountName");
        Intrinsics.checkNotNullParameter(customLabel, "customLabel");
        this.f300913a = accountDetailsId;
        this.f300914b = originalAccountName;
        this.f300915c = customLabel;
        this.d = topUpMethodsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f300913a, rVar.f300913a) && Intrinsics.f(this.f300914b, rVar.f300914b) && Intrinsics.f(this.f300915c, rVar.f300915c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f300913a.hashCode() * 31, 31, this.f300914b), 31, this.f300915c);
        TopUpMethodsContext topUpMethodsContext = this.d;
        return iC + (topUpMethodsContext == null ? 0 : topUpMethodsContext.hashCode());
    }
}
