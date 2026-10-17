package ew8;

import kotlin.jvm.internal.Intrinsics;
import pd7.m;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f130109a;

    public c(m result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f130109a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f130109a, ((c) obj2).f130109a);
    }

    public final int hashCode() {
        return this.f130109a.hashCode();
    }
}
