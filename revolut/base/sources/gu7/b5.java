package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b5 {

    @NotNull
    public static final a5 Companion = new a5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146717c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146719b;

    public /* synthetic */ b5(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(z4.f146879a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146718a = str;
        this.f146719b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj2;
        return Intrinsics.f(this.f146718a, b5Var.f146718a) && Intrinsics.f(this.f146719b, b5Var.f146719b);
    }

    public final int hashCode() {
        return this.f146719b.hashCode() + (this.f146718a.hashCode() * 31);
    }
}
