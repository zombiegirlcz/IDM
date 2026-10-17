package sfe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements qv0.p, koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f262433a;

    public v(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f262433a = model;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f262433a.u;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53150a() {
        return this.f262433a.f53228a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f262433a, ((v) obj2).f262433a);
    }

    public final int hashCode() {
        return this.f262433a.hashCode();
    }
}
