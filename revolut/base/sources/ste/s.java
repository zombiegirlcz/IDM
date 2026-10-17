package ste;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f265574a;

    public s(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f265574a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f265574a, ((s) obj2).f265574a);
    }

    public final int hashCode() {
        return this.f265574a.hashCode();
    }
}
