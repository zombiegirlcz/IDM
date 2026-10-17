package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k6 {

    @NotNull
    public static final j6 Companion = new j6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f294903c = {null, yhm.j.c(yhm.k.PUBLICATION, new b6(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294905b;

    public /* synthetic */ k6(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(i6.f294877a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294904a = str;
        this.f294905b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj2;
        return Intrinsics.f(this.f294904a, k6Var.f294904a) && Intrinsics.f(this.f294905b, k6Var.f294905b);
    }

    public final int hashCode() {
        return this.f294905b.hashCode() + (this.f294904a.hashCode() * 31);
    }

    public k6(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294904a = title;
        this.f294905b = items;
    }
}
