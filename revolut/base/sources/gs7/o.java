package gs7;

import gr2.j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146342c = {null, yhm.j.c(yhm.k.PUBLICATION, new j0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146344b;

    public o(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(m.f146341a.getDescriptor(), i, 1);
            throw null;
        }
        this.f146343a = str;
        if ((i & 2) == 0) {
            this.f146344b = f0.f322471a;
        } else {
            this.f146344b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f146343a, oVar.f146343a) && Intrinsics.f(this.f146344b, oVar.f146344b);
    }

    public final int hashCode() {
        String str = this.f146343a;
        return this.f146344b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public o(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146343a = str;
        this.f146344b = items;
    }
}
