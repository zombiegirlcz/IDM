package sfe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f262434a;

    public w(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f262434a = model;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f262434a, ((w) obj2).f262434a);
    }

    public final int hashCode() {
        return this.f262434a.hashCode();
    }
}
