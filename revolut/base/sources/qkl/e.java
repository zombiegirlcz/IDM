package qkl;

import bjl.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f247027a;

    public e(i0 outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f247027a = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f247027a, ((e) obj2).f247027a);
    }

    public final int hashCode() {
        return this.f247027a.hashCode();
    }
}
