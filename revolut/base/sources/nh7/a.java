package nh7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph7.c f215377a;

    public a(ph7.c collectionKey) {
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f215377a = collectionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f215377a == ((a) obj2).f215377a;
    }

    public final int hashCode() {
        return this.f215377a.hashCode();
    }
}
