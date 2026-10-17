package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z9 {

    @NotNull
    public static final y9 Companion = new y9();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153402c;

    public /* synthetic */ z9(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            qlm.j1.f(x9.f153369a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153400a = str;
        this.f153401b = z;
        this.f153402c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj2;
        return Intrinsics.f(this.f153400a, z9Var.f153400a) && this.f153401b == z9Var.f153401b && Intrinsics.f(this.f153402c, z9Var.f153402c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f153400a.hashCode() * 31, 31, this.f153401b);
        List list = this.f153402c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
