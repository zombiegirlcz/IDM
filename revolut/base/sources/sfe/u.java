package sfe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements qv0.p, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f262432a;

    public u(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f262432a = model;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f262432a.f53228a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f262432a, ((u) obj2).f262432a);
    }

    public final int hashCode() {
        return this.f262432a.hashCode();
    }
}
