package a02;

import com.revolut.feature.apm.core.models.alias.error.AliasNotFoundException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasNotFoundException f111a;

    public e(AliasNotFoundException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f111a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f111a, ((e) obj2).f111a);
    }

    @Override // a02.g
    public final Throwable getError() {
        return this.f111a;
    }

    public final int hashCode() {
        return this.f111a.hashCode();
    }
}
