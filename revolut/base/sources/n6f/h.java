package n6f;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f212782a;

    public h(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f212782a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f212782a, ((h) obj2).f212782a);
    }

    public final int hashCode() {
        return this.f212782a.hashCode();
    }
}
