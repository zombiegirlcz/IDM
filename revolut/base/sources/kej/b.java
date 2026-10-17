package kej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RuntimeException f183091a;

    public b(RuntimeException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f183091a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f183091a.equals(((b) obj2).f183091a);
    }

    public final int hashCode() {
        return this.f183091a.hashCode();
    }
}
