package jxe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f179165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179166b;

    public b(dj0.d selectedAmount, List suggestedAmounts) {
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        Intrinsics.checkNotNullParameter(suggestedAmounts, "suggestedAmounts");
        this.f179165a = selectedAmount;
        this.f179166b = suggestedAmounts;
    }

    @Override // jxe.c
    public final dj0.d a() {
        return this.f179165a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f179165a, bVar.f179165a) && Intrinsics.f(this.f179166b, bVar.f179166b);
    }

    public final int hashCode() {
        return this.f179166b.hashCode() + (this.f179165a.hashCode() * 31);
    }
}
