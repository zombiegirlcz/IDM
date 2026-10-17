package oqj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f227916c = {null, yhm.j.c(k.PUBLICATION, new d(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227918b;

    public /* synthetic */ g(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e.f227915a.getDescriptor(), i, 3);
            throw null;
        }
        this.f227917a = str;
        this.f227918b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f227917a, gVar.f227917a) && Intrinsics.f(this.f227918b, gVar.f227918b);
    }

    public final int hashCode() {
        return this.f227918b.hashCode() + (this.f227917a.hashCode() * 31);
    }
}
