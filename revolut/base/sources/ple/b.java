package ple;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final soa.b f237365a;

    public b(soa.b setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f237365a = setting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f237365a, ((b) obj2).f237365a);
    }

    public final int hashCode() {
        return this.f237365a.hashCode();
    }
}
