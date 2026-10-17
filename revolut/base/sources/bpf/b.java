package bpf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f17621a;

    public b(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        Intrinsics.checkNotNullParameter("SELECT_REASON_BUTTON_TAG", "buttonTag");
        this.f17621a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f17621a, ((b) obj2).f17621a);
    }

    public final int hashCode() {
        return (this.f17621a.hashCode() * 31) + 710274373;
    }
}
