package mr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f208060a;

    public b(a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f208060a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f208060a == ((b) obj2).f208060a;
    }

    public final int hashCode() {
        return this.f208060a.hashCode();
    }
}
