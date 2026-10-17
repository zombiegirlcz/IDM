package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f3369c = {null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3371b;

    public /* synthetic */ c0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(a0.f3363a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3370a = str;
        this.f3371b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f3370a, c0Var.f3370a) && Intrinsics.f(this.f3371b, c0Var.f3371b);
    }

    public final int hashCode() {
        return this.f3371b.hashCode() + (this.f3370a.hashCode() * 31);
    }

    public c0(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3370a = title;
        this.f3371b = items;
    }
}
