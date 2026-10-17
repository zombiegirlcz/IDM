package x1a;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f302357a;

    public d(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f302357a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f302357a, ((d) obj2).f302357a);
    }

    public final int hashCode() {
        return this.f302357a.hashCode();
    }
}
