package it3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f168322a;

    public b(d application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f168322a = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f168322a, ((b) obj2).f168322a);
    }

    public final int hashCode() {
        return this.f168322a.hashCode();
    }
}
