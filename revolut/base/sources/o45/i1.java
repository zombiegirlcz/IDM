package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i1 extends f1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222065b;

    public /* synthetic */ i1(int i, String str) {
        if (1 == (i & 1)) {
            this.f222065b = str;
        } else {
            qlm.j1.f(g1.f222061a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && Intrinsics.f(this.f222065b, ((i1) obj2).f222065b);
    }

    public final int hashCode() {
        return this.f222065b.hashCode();
    }

    public i1(String renegotiationType) {
        Intrinsics.checkNotNullParameter(renegotiationType, "renegotiationType");
        this.f222065b = renegotiationType;
    }
}
