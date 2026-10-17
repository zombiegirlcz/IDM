package sib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f263534a;

    public b(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f263534a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f263534a == ((b) obj2).f263534a;
    }

    public final int hashCode() {
        return this.f263534a.hashCode();
    }
}
