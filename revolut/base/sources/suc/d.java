package suc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tuc.m f265705a;

    public d(tuc.m screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f265705a = screenType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f265705a == ((d) obj2).f265705a;
    }

    public final int hashCode() {
        return this.f265705a.hashCode();
    }
}
