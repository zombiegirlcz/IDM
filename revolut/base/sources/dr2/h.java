package dr2;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq2.c f117077a;

    public h(xq2.c processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        this.f117077a = processingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f117077a, ((h) obj2).f117077a);
    }

    public final int hashCode() {
        return this.f117077a.hashCode() * 31;
    }
}
