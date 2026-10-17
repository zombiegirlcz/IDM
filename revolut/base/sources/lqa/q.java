package lqa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new lkf.f0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f199268c;

    public /* synthetic */ q(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            j1.f(o.f199265a.getDescriptor(), i, 7);
            throw null;
        }
        this.f199266a = z;
        this.f199267b = str;
        this.f199268c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f199266a == qVar.f199266a && Intrinsics.f(this.f199267b, qVar.f199267b) && Intrinsics.f(this.f199268c, qVar.f199268c);
    }

    public final int hashCode() {
        return this.f199268c.hashCode() + p.a.c(Boolean.hashCode(this.f199266a) * 31, 31, this.f199267b);
    }
}
