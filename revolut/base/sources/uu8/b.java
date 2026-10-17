package uu8;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f283165a;

    public b(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f283165a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f283165a, ((b) obj2).f283165a);
    }

    public final int hashCode() {
        return this.f283165a.hashCode();
    }
}
