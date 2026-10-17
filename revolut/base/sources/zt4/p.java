package zt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325082a;

    public p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f325082a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f325082a, ((p) obj2).f325082a);
    }

    public final int hashCode() {
        return this.f325082a.hashCode();
    }
}
