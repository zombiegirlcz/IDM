package eo3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127863a;

    public b(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f127863a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f127863a, ((b) obj2).f127863a);
    }

    public final int hashCode() {
        return this.f127863a.hashCode();
    }
}
