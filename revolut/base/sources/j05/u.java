package j05;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169976c;

    public u(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            j1.f(s.f169973a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169974a = str;
        this.f169975b = str2;
        if ((i & 4) == 0) {
            this.f169976c = f0.f322471a;
        } else {
            this.f169976c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f169974a, uVar.f169974a) && Intrinsics.f(this.f169975b, uVar.f169975b) && Intrinsics.f(this.f169976c, uVar.f169976c);
    }

    public final int hashCode() {
        return this.f169976c.hashCode() + p.a.c(this.f169974a.hashCode() * 31, 31, this.f169975b);
    }
}
