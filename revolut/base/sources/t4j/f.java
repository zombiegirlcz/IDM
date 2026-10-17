package t4j;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f268007a;

    public f(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f268007a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f268007a, ((f) obj2).f268007a);
    }

    public final int hashCode() {
        return this.f268007a.hashCode();
    }
}
