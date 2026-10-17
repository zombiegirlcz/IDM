package ujb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new v(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f280586c;

    public /* synthetic */ r0(int i, String str, List list, Boolean bool) {
        if (7 != (i & 7)) {
            j1.f(p0.f280577a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280584a = str;
        this.f280585b = list;
        this.f280586c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f280584a, r0Var.f280584a) && Intrinsics.f(this.f280585b, r0Var.f280585b) && Intrinsics.f(this.f280586c, r0Var.f280586c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f280584a.hashCode() * 31, 31, this.f280585b);
        Boolean bool = this.f280586c;
        return iD + (bool == null ? 0 : bool.hashCode());
    }

    public r0(String templateId, ArrayList substitutions, Boolean bool) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(substitutions, "substitutions");
        this.f280584a = templateId;
        this.f280585b = substitutions;
        this.f280586c = bool;
    }
}
