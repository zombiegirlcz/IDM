package qj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246762a;

    public a(String transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        this.f246762a = transferId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f246762a, ((a) obj2).f246762a);
    }

    public final int hashCode() {
        return this.f246762a.hashCode();
    }
}
