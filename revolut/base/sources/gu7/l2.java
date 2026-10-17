package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l2 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146783c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146785b;

    public /* synthetic */ l2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(s1.f146828a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146784a = str;
        this.f146785b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f146784a, l2Var.f146784a) && Intrinsics.f(this.f146785b, l2Var.f146785b);
    }

    public final int hashCode() {
        return this.f146785b.hashCode() + (this.f146784a.hashCode() * 31);
    }

    public l2(String title, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f146784a = title;
        this.f146785b = tabs;
    }
}
