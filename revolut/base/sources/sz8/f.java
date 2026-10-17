package sz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f266779b = {j.c(k.PUBLICATION, new sq5.j(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266780a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f266780a = list;
        } else {
            j1.f(d.f266778a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f266780a, ((f) obj2).f266780a);
    }

    public final int hashCode() {
        return this.f266780a.hashCode();
    }
}
