package rw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f257795a;

    public b(i text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f257795a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f257795a, ((b) obj2).f257795a);
    }

    public final int hashCode() {
        return this.f257795a.hashCode();
    }
}
