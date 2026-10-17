package x1e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f302392c = {null, yhm.j.c(yhm.k.PUBLICATION, new g(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302394b;

    public /* synthetic */ s(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(q.f302391a.getDescriptor(), i, 3);
            throw null;
        }
        this.f302393a = str;
        this.f302394b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f302393a, sVar.f302393a) && Intrinsics.f(this.f302394b, sVar.f302394b);
    }

    public final int hashCode() {
        return this.f302394b.hashCode() + (this.f302393a.hashCode() * 31);
    }

    public s(String name, ArrayList values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f302393a = name;
        this.f302394b = values;
    }
}
