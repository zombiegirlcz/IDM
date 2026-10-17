package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h5 {

    @NotNull
    public static final g5 Companion = new g5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146761c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146763b;

    public /* synthetic */ h5(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(f5.f146749a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146762a = str;
        this.f146763b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj2;
        return Intrinsics.f(this.f146762a, h5Var.f146762a) && Intrinsics.f(this.f146763b, h5Var.f146763b);
    }

    public final int hashCode() {
        return this.f146763b.hashCode() + (this.f146762a.hashCode() * 31);
    }
}
