package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f3426c = {null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3428b;

    public /* synthetic */ r0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(p0.f3424a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3427a = str;
        this.f3428b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f3427a, r0Var.f3427a) && Intrinsics.f(this.f3428b, r0Var.f3428b);
    }

    public final int hashCode() {
        return this.f3428b.hashCode() + (this.f3427a.hashCode() * 31);
    }

    public r0(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3427a = title;
        this.f3428b = items;
    }
}
