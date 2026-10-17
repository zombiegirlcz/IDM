package dqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f116940a;

    public c(f destinationType) {
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        this.f116940a = destinationType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f116940a, ((c) obj2).f116940a);
    }

    public final int hashCode() {
        return this.f116940a.hashCode();
    }
}
