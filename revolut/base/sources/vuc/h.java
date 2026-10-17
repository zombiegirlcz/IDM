package vuc;

import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f292321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityHubProductArticleKey f292322b;

    public h(f0 revolutCard, SecurityHubProductArticleKey securityHubProductArticleKey) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f292321a = revolutCard;
        this.f292322b = securityHubProductArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f292321a, hVar.f292321a) && this.f292322b == hVar.f292322b;
    }

    public final int hashCode() {
        int iHashCode = this.f292321a.hashCode() * 31;
        SecurityHubProductArticleKey securityHubProductArticleKey = this.f292322b;
        return iHashCode + (securityHubProductArticleKey == null ? 0 : securityHubProductArticleKey.hashCode());
    }
}
