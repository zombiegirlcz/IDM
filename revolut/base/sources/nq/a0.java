package nq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218282a;

    public a0(List mediaKeys) {
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        this.f218282a = mediaKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f218282a, ((a0) obj2).f218282a);
    }

    public final int hashCode() {
        return this.f218282a.hashCode();
    }
}
