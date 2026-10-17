package cq8;

import aw0.n6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f108027a;

    public e(n6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f108027a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f108027a, ((e) obj2).f108027a);
    }

    public final int hashCode() {
        return this.f108027a.hashCode();
    }
}
