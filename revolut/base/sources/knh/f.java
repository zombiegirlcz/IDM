package knh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgl.c f186169a;

    public f(wgl.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f186169a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f186169a.equals(((f) obj2).f186169a);
    }

    public final int hashCode() {
        return this.f186169a.hashCode();
    }
}
