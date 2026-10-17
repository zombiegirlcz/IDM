package qkl;

import bjl.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f247024a;

    public a(i0 outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f247024a = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f247024a, ((a) obj2).f247024a);
    }

    public final int hashCode() {
        return this.f247024a.hashCode();
    }
}
