package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f154952a;

    public u0(v0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f154952a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u0) && Intrinsics.f(this.f154952a, ((u0) obj2).f154952a);
    }

    public final int hashCode() {
        return this.f154952a.f154956a.hashCode();
    }
}
