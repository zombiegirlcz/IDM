package clc;

import aii.e;
import dfl.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f24970a;

    public a(i0 trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f24970a = trade;
    }

    public final i0 b() {
        return this.f24970a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f24970a, ((a) obj2).f24970a);
    }

    public final int hashCode() {
        return this.f24970a.hashCode();
    }
}
