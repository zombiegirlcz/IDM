package mj9;

import kotlin.jvm.internal.Intrinsics;
import zh9.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f205973a;

    public a(i0 management) {
        Intrinsics.checkNotNullParameter(management, "management");
        this.f205973a = management;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f205973a, ((a) obj2).f205973a);
    }

    public final int hashCode() {
        return this.f205973a.hashCode();
    }
}
