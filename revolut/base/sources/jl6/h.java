package jl6;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f175606a;

    public h(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f175606a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f175606a, ((h) obj2).f175606a);
    }

    public final int hashCode() {
        return this.f175606a.hashCode();
    }
}
