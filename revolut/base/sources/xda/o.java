package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f304350c = {null, yhm.j.c(yhm.k.PUBLICATION, new x5a.d(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304352b;

    public /* synthetic */ o(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(m.f304348a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304351a = str;
        this.f304352b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f304351a, oVar.f304351a) && Intrinsics.f(this.f304352b, oVar.f304352b);
    }

    public final int hashCode() {
        return this.f304352b.hashCode() + (this.f304351a.hashCode() * 31);
    }
}
