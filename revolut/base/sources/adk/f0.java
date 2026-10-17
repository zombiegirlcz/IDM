package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f3382c = {null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3384b;

    public /* synthetic */ f0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(d0.f3374a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3383a = str;
        this.f3384b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f3383a, f0Var.f3383a) && Intrinsics.f(this.f3384b, f0Var.f3384b);
    }

    public final int hashCode() {
        return this.f3384b.hashCode() + (this.f3383a.hashCode() * 31);
    }

    public f0(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3383a = title;
        this.f3384b = items;
    }
}
