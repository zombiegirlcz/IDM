package c5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw0.a f21513b;

    public m(String anchorItemId, mw0.a model) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f21512a = anchorItemId;
        this.f21513b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f21512a, mVar.f21512a) && Intrinsics.f(this.f21513b, mVar.f21513b);
    }

    public final int hashCode() {
        return this.f21513b.hashCode() + (this.f21512a.hashCode() * 31);
    }
}
