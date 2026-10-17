package yuc;

import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f316981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityHubProductArticleKey f316982b;

    public j(f0 revolutCard, SecurityHubProductArticleKey securityHubProductArticleKey) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f316981a = revolutCard;
        this.f316982b = securityHubProductArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f316981a, jVar.f316981a) && this.f316982b == jVar.f316982b;
    }

    public final int hashCode() {
        int iHashCode = this.f316981a.hashCode() * 31;
        SecurityHubProductArticleKey securityHubProductArticleKey = this.f316982b;
        return iHashCode + (securityHubProductArticleKey == null ? 0 : securityHubProductArticleKey.hashCode());
    }
}
