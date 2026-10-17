package m8e;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f203536a;

    public i(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f203536a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f203536a, ((i) obj2).f203536a);
    }

    public final int hashCode() {
        return this.f203536a.hashCode();
    }
}
