package iw;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f168885a;

    public a(Map result, List thumbnails) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        Pair pair = new Pair(result, thumbnails);
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.f168885a = pair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f168885a, ((a) obj2).f168885a);
    }

    public final int hashCode() {
        return this.f168885a.hashCode();
    }
}
