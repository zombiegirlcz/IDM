package vwg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f292749c = {null, yhm.j.c(yhm.k.PUBLICATION, new vo8.b(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f292751b;

    public /* synthetic */ r(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(p.f292748a.getDescriptor(), i, 3);
            throw null;
        }
        this.f292750a = str;
        this.f292751b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f292750a, rVar.f292750a) && Intrinsics.f(this.f292751b, rVar.f292751b);
    }

    public final int hashCode() {
        return this.f292751b.hashCode() + (this.f292750a.hashCode() * 31);
    }

    public r(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292750a = title;
        this.f292751b = items;
    }
}
