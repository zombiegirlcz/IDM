package sfe;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements qv0.p, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallStockCardDelegate.Model f262436a;

    public y(SmallStockCardDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f262436a = model;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53364p() {
        return this;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53355a() {
        return this.f262436a.f53379a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f262436a, ((y) obj2).f262436a);
    }

    public final int hashCode() {
        return this.f262436a.hashCode();
    }
}
