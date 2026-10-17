package p5l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233193a;

    public a(List designs) {
        Intrinsics.checkNotNullParameter(designs, "designs");
        this.f233193a = designs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f233193a, ((a) obj2).f233193a);
    }

    public final int hashCode() {
        return this.f233193a.hashCode();
    }
}
