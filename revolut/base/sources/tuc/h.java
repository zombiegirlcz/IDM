package tuc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuc.g f274577a;

    public h(vuc.g entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f274577a = entryPoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f274577a == ((h) obj2).f274577a;
    }

    public final int hashCode() {
        return this.f274577a.hashCode();
    }
}
