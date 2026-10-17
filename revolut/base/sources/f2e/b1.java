package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131542b = {yhm.j.c(yhm.k.PUBLICATION, new i(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131543a;

    public /* synthetic */ b1(int i, List list) {
        if (1 == (i & 1)) {
            this.f131543a = list;
        } else {
            qlm.j1.f(z0.f131776a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f131543a, ((b1) obj2).f131543a);
    }

    public final int hashCode() {
        return this.f131543a.hashCode();
    }

    public b1(ArrayList filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f131543a = filters;
    }
}
