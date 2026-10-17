package aii;

import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends ModalDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.common.b f5293a;

    public t(com.revolut.kompot.common.b inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f5293a = inner;
    }

    public final ModalDestination a() {
        return this.f5293a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f5293a.equals(((t) obj2).f5293a);
    }

    public final int hashCode() {
        return this.f5293a.hashCode();
    }
}
