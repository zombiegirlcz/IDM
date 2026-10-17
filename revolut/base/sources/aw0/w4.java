package aw0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w4 extends x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f10585a;

    public w4(Function2 heightProviderPx) {
        Intrinsics.checkNotNullParameter(heightProviderPx, "heightProviderPx");
        this.f10585a = heightProviderPx;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w4) && Intrinsics.f(this.f10585a, ((w4) obj2).f10585a);
    }

    public final int hashCode() {
        return this.f10585a.hashCode();
    }
}
