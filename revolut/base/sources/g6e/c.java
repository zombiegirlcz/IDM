package g6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f140918a;

    public c(Object delegateModel) {
        Intrinsics.checkNotNullParameter(delegateModel, "delegateModel");
        this.f140918a = delegateModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f140918a, ((c) obj2).f140918a);
    }

    public final int hashCode() {
        return this.f140918a.hashCode() * 31;
    }
}
