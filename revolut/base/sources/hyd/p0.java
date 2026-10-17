package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f156821c = {null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156823b;

    public /* synthetic */ p0(int i, String str, List list) {
        if (2 != (i & 2)) {
            j1.f(n0.f156817a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f156822a = null;
        } else {
            this.f156822a = str;
        }
        this.f156823b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f156822a, p0Var.f156822a) && Intrinsics.f(this.f156823b, p0Var.f156823b);
    }

    public final int hashCode() {
        String str = this.f156822a;
        return this.f156823b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
