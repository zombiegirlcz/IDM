package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v2 extends p2 {

    @NotNull
    public static final u2 Companion = new u2();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new v1(6)), null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146848c;

    public /* synthetic */ v2(int i, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(t2.f146835a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146847b = list;
        this.f146848c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f146847b, v2Var.f146847b) && Intrinsics.f(this.f146848c, v2Var.f146848c);
    }

    public final int hashCode() {
        int iHashCode = this.f146847b.hashCode() * 31;
        String str = this.f146848c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public v2(List planIds, String str) {
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        this.f146847b = planIds;
        this.f146848c = str;
    }
}
