package gkl;

import com.revolut.sso.impl.domain.models.SsoServerError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SsoServerError.AccountIsNotRelatedToUser f144439a;

    public d(SsoServerError.AccountIsNotRelatedToUser error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f144439a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f144439a.equals(((d) obj2).f144439a);
    }

    public final int hashCode() {
        return this.f144439a.hashCode();
    }
}
