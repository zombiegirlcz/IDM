package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f156810c = {null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f156811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156812b;

    public /* synthetic */ l(int i, o oVar, List list) {
        if (1 != (i & 1)) {
            j1.f(j.f156806a.getDescriptor(), i, 1);
            throw null;
        }
        this.f156811a = oVar;
        if ((i & 2) == 0) {
            this.f156812b = null;
        } else {
            this.f156812b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f156811a, lVar.f156811a) && Intrinsics.f(this.f156812b, lVar.f156812b);
    }

    public final int hashCode() {
        int iHashCode = this.f156811a.hashCode() * 31;
        List list = this.f156812b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
