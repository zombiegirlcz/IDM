package fed;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f134530b = {yhm.j.c(yhm.k.PUBLICATION, new fce.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134531a;

    public /* synthetic */ j(int i, List list) {
        if (1 == (i & 1)) {
            this.f134531a = list;
        } else {
            j1.f(h.f134529a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f134531a, ((j) obj2).f134531a);
    }

    public final int hashCode() {
        return this.f134531a.hashCode();
    }
}
