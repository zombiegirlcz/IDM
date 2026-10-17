package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f117739b = {yhm.j.c(yhm.k.PUBLICATION, new ds7.a(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117740a;

    public /* synthetic */ l(int i, List list) {
        if (1 == (i & 1)) {
            this.f117740a = list;
        } else {
            qlm.j1.f(j.f117723a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f117740a, ((l) obj2).f117740a);
    }

    public final int hashCode() {
        return this.f117740a.hashCode();
    }
}
