package qll;

import gkl.l1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f247577a;

    public a0(l1 option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f247577a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f247577a, ((a0) obj2).f247577a);
    }

    public final int hashCode() {
        return this.f247577a.hashCode();
    }
}
