package tkd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f271940b = {yhm.j.c(yhm.k.PUBLICATION, new th9.k(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271941a;

    public /* synthetic */ h(int i, List list) {
        if (1 == (i & 1)) {
            this.f271941a = list;
        } else {
            j1.f(f.f271939a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f271941a, ((h) obj2).f271941a);
    }

    public final int hashCode() {
        return this.f271941a.hashCode();
    }

    public h(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f271941a = actions;
    }
}
