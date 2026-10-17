package sjk;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f263739a;

    public f(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f263739a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f263739a, ((f) obj2).f263739a);
    }

    public final int hashCode() {
        return this.f263739a.hashCode();
    }
}
