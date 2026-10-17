package eq8;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh f128402a;

    public s(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f128402a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f128402a, ((s) obj2).f128402a);
    }

    public final int hashCode() {
        return this.f128402a.hashCode();
    }
}
