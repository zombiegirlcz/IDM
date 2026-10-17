package knh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f186166a;

    public c(a assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f186166a = assetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f186166a == ((c) obj2).f186166a;
    }

    public final int hashCode() {
        return this.f186166a.hashCode();
    }
}
