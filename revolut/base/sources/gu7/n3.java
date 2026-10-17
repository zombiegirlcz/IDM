package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n3 extends e3 {

    @NotNull
    public static final m3 Companion = new m3();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new v1(12)), null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146803c;

    public /* synthetic */ n3(int i, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(l3.f146786a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146802b = list;
        this.f146803c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f146802b, n3Var.f146802b) && Intrinsics.f(this.f146803c, n3Var.f146803c);
    }

    public final int hashCode() {
        int iHashCode = this.f146802b.hashCode() * 31;
        String str = this.f146803c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public n3(List planIds, String str) {
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        this.f146802b = planIds;
        this.f146803c = str;
    }
}
