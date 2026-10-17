package j05;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f169956c = {null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169958b;

    public /* synthetic */ i(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(g.f169955a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169957a = str;
        this.f169958b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f169957a, iVar.f169957a) && Intrinsics.f(this.f169958b, iVar.f169958b);
    }

    public final int hashCode() {
        return this.f169958b.hashCode() + (this.f169957a.hashCode() * 31);
    }
}
