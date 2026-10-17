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
public final class p {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146345c = {null, yhm.j.c(yhm.k.PUBLICATION, new j0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146347b;

    public p(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(a.f146330a.getDescriptor(), i, 1);
            throw null;
        }
        this.f146346a = str;
        if ((i & 2) == 0) {
            this.f146347b = f0.f322471a;
        } else {
            this.f146347b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f146346a, pVar.f146346a) && Intrinsics.f(this.f146347b, pVar.f146347b);
    }

    public final int hashCode() {
        return this.f146347b.hashCode() + (this.f146346a.hashCode() * 31);
    }

    public p(String title, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f146346a = title;
        this.f146347b = tabs;
    }
}
