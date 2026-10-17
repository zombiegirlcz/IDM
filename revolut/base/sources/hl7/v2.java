package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v2 {

    @NotNull
    public static final u2 Companion = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f153336b;

    public /* synthetic */ v2(int i, String str, Integer num) {
        if (3 != (i & 3)) {
            qlm.j1.f(t2.f153311a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153335a = str;
        this.f153336b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f153335a, v2Var.f153335a) && Intrinsics.f(this.f153336b, v2Var.f153336b);
    }

    public final int hashCode() {
        int iHashCode = this.f153335a.hashCode() * 31;
        Integer num = this.f153336b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
