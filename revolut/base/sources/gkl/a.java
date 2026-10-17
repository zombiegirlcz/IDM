package gkl;

import com.revolut.sso.impl.domain.models.SsoServerError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SsoServerError f144432a;

    public a(SsoServerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f144432a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f144432a, ((a) obj2).f144432a);
    }

    public final int hashCode() {
        return this.f144432a.hashCode();
    }
}
