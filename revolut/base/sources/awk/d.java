package awk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trk.a f10798a;

    public d(trk.a assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f10798a = assetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f10798a == ((d) obj2).f10798a;
    }

    public final int hashCode() {
        return this.f10798a.hashCode();
    }
}
