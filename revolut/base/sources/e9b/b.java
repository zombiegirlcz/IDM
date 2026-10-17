package e9b;

import com.revolut.core.error.data.model.ServerError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServerError f123939a;

    public b(ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        this.f123939a = serverError;
    }

    public final ServerError a() {
        return this.f123939a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f123939a, ((b) obj2).f123939a);
    }

    public final int hashCode() {
        return this.f123939a.hashCode();
    }
}
