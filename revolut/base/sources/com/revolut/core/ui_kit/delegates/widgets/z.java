package com.revolut.core.ui_kit.delegates.widgets;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.models.f f55573b;

    public z(List segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f55572a = segments;
        this.f55573b = com.revolut.core.ui_kit.models.j0.a(segments, null, null, false, aw0.n4.NO_SORT, null, Constants.TAG_E4_CUSTOMER_DATA);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f55572a, ((z) obj2).f55572a);
    }

    public final int hashCode() {
        return this.f55572a.hashCode();
    }
}
