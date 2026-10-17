package fkb;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f135742a;

    public e(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f135742a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f135742a, ((e) obj2).f135742a);
    }

    public final int hashCode() {
        return this.f135742a.hashCode();
    }
}
