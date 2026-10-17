package ci7;

import chc.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f24400c = {null, yhm.j.c(yhm.k.PUBLICATION, new c0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24402b;

    public /* synthetic */ a0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(y.f24429a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24401a = str;
        this.f24402b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f24401a, a0Var.f24401a) && Intrinsics.f(this.f24402b, a0Var.f24402b);
    }

    public final int hashCode() {
        int iHashCode = this.f24401a.hashCode() * 31;
        List list = this.f24402b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public a0(String key, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f24401a = key;
        this.f24402b = arrayList;
    }
}
