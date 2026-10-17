package gkl;

import com.revolut.sso.impl.domain.models.SsoServerError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SsoServerError f144458a;

    public i1(SsoServerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f144458a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && Intrinsics.f(this.f144458a, ((i1) obj2).f144458a);
    }

    public final int hashCode() {
        return this.f144458a.hashCode();
    }
}
