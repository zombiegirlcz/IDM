package aq6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8273a;

    public f(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f8273a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f8273a, ((f) obj2).f8273a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8273a.f8270a);
    }
}
