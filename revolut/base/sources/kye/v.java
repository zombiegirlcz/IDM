package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sye.e f190853a;

    public v(sye.e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f190853a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f190853a, ((v) obj2).f190853a);
    }

    public final int hashCode() {
        return this.f190853a.hashCode();
    }
}
