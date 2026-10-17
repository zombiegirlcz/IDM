package bbc;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f14250a;

    public g(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f14250a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f14250a, ((g) obj2).f14250a);
    }

    public final int hashCode() {
        return this.f14250a.hashCode();
    }
}
