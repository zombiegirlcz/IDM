package nnj;

import dej.e3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f217690a;

    public h(e3 selectedRefundReason) {
        Intrinsics.checkNotNullParameter(selectedRefundReason, "selectedRefundReason");
        this.f217690a = selectedRefundReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f217690a == ((h) obj2).f217690a;
    }

    public final int hashCode() {
        return this.f217690a.hashCode();
    }
}
