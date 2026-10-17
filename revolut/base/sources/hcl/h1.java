package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f151001c = {null, yhm.j.c(yhm.k.PUBLICATION, new h43.b(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151003b;

    public /* synthetic */ h1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(f1.f150986a.getDescriptor(), i, 3);
            throw null;
        }
        this.f151002a = str;
        this.f151003b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f151002a, h1Var.f151002a) && Intrinsics.f(this.f151003b, h1Var.f151003b);
    }

    public final int hashCode() {
        return this.f151003b.hashCode() + (this.f151002a.hashCode() * 31);
    }

    public h1(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f151002a = title;
        this.f151003b = items;
    }
}
