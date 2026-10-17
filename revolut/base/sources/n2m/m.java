package n2m;

import com.trustdockekyc.core.backend.domain.model.AppError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppError f211605a;

    public m(AppError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f211605a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f211605a.equals(((m) obj2).f211605a);
    }

    public final int hashCode() {
        return this.f211605a.hashCode() * 31;
    }

    public final String toString() {
        return "ShowErrorEventArgs(error=" + this.f211605a + ", message=null)";
    }
}
