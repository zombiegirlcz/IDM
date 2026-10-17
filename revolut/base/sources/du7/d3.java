package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d3 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117639c = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117641b;

    public d3(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(q2.f117819a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117640a = str;
        if ((i & 2) == 0) {
            this.f117641b = zhm.f0.f322471a;
        } else {
            this.f117641b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f117640a, d3Var.f117640a) && Intrinsics.f(this.f117641b, d3Var.f117641b);
    }

    public final int hashCode() {
        String str = this.f117640a;
        return this.f117641b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
