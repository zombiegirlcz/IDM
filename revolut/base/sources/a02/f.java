package a02;

import com.revolut.feature.apm.core.models.alias.error.TooManyRequestsException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TooManyRequestsException f112a;

    public f(TooManyRequestsException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f112a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f112a.equals(((f) obj2).f112a);
    }

    @Override // a02.g
    public final Throwable getError() {
        return this.f112a;
    }

    public final int hashCode() {
        return this.f112a.hashCode();
    }
}
