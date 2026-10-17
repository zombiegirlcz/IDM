package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k6 {

    @NotNull
    public static final j6 Companion = new j6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153171c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153173b;

    public /* synthetic */ k6(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(i6.f153147a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153172a = str;
        this.f153173b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj2;
        return Intrinsics.f(this.f153172a, k6Var.f153172a) && Intrinsics.f(this.f153173b, k6Var.f153173b);
    }

    public final int hashCode() {
        return this.f153173b.hashCode() + (this.f153172a.hashCode() * 31);
    }
}
