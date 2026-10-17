package kdl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f182908b = {yhm.j.c(yhm.k.PUBLICATION, new ka9.b(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182909a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f182909a = list;
        } else {
            j1.f(d.f182907a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f182909a, ((f) obj2).f182909a);
    }

    public final int hashCode() {
        return this.f182909a.hashCode();
    }

    public f(ArrayList industries) {
        Intrinsics.checkNotNullParameter(industries, "industries");
        this.f182909a = industries;
    }
}
