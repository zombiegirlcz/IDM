package vq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgf.h f291323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291324b;

    public i(bgf.h workflow, String transactionGroupId) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f291323a = workflow;
        this.f291324b = transactionGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f291323a, iVar.f291323a) && Intrinsics.f(this.f291324b, iVar.f291324b);
    }

    public final int hashCode() {
        return this.f291324b.hashCode() + (this.f291323a.hashCode() * 31);
    }
}
