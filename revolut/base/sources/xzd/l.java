package xzd;

import com.revolut.core.ui_kit.utils.ListIdTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIdTarget f309933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw0.a f309934b;

    public l(ListIdTarget target, mw0.a model) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f309933a = target;
        this.f309934b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f309933a.equals(lVar.f309933a) && this.f309934b.equals(lVar.f309934b);
    }

    public final int hashCode() {
        return this.f309934b.hashCode() + (this.f309933a.f58286a.hashCode() * 31);
    }
}
