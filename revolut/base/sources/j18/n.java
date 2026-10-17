package j18;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f170147b = {yhm.j.c(yhm.k.PUBLICATION, new j(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170148a;

    public /* synthetic */ n(int i, List list) {
        if (1 == (i & 1)) {
            this.f170148a = list;
        } else {
            j1.f(l.f170146a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f170148a, ((n) obj2).f170148a);
    }

    public final int hashCode() {
        return this.f170148a.hashCode();
    }
}
