package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c7 {

    @NotNull
    public static final b7 Companion = new b7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f294800c = {null, yhm.j.c(yhm.k.PUBLICATION, new b6(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294802b;

    public /* synthetic */ c7(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(a7.f294782a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294801a = str;
        this.f294802b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj2;
        return Intrinsics.f(this.f294801a, c7Var.f294801a) && Intrinsics.f(this.f294802b, c7Var.f294802b);
    }

    public final int hashCode() {
        return this.f294802b.hashCode() + (this.f294801a.hashCode() * 31);
    }

    public c7(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294801a = title;
        this.f294802b = items;
    }
}
