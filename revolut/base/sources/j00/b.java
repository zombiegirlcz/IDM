package j00;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f169900a;

    public b(Set errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f169900a = errors;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f169900a, ((b) obj2).f169900a);
    }

    public final int hashCode() {
        return this.f169900a.hashCode();
    }
}
