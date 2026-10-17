package zl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f323176a;

    public a(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f323176a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f323176a, ((a) obj2).f323176a);
    }

    public final int hashCode() {
        return this.f323176a.hashCode();
    }
}
