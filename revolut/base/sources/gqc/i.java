package gqc;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f145636c = {null, yhm.j.c(yhm.k.PUBLICATION, new gla.k(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145638b;

    public /* synthetic */ i(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(g.f145629a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145637a = str;
        this.f145638b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f145637a, iVar.f145637a) && Intrinsics.f(this.f145638b, iVar.f145638b);
    }

    public final int hashCode() {
        return this.f145638b.hashCode() + (this.f145637a.hashCode() * 31);
    }
}
