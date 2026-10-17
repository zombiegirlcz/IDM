package br7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17938a;

    public g(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f17938a = files;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f17938a, ((g) obj2).f17938a);
    }

    public final int hashCode() {
        return this.f17938a.hashCode();
    }
}
