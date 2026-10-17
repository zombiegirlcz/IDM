package jzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179809a;

    public a(List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f179809a = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f179809a, ((a) obj2).f179809a);
    }

    public final int hashCode() {
        return this.f179809a.hashCode();
    }
}
