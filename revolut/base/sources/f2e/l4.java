package f2e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l4 {

    @NotNull
    public static final k4 Companion = new k4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131652b = {yhm.j.c(yhm.k.PUBLICATION, new i(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131653a;

    public /* synthetic */ l4(int i, List list) {
        if (1 == (i & 1)) {
            this.f131653a = list;
        } else {
            qlm.j1.f(j4.f131634a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l4) && Intrinsics.f(this.f131653a, ((l4) obj2).f131653a);
    }

    public final int hashCode() {
        return this.f131653a.hashCode();
    }
}
