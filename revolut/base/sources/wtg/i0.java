package wtg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f299959c = {null, yhm.j.c(yhm.k.PUBLICATION, new wq1.a(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f299961b;

    public /* synthetic */ i0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(g0.f299955a.getDescriptor(), i, 3);
            throw null;
        }
        this.f299960a = str;
        this.f299961b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f299960a, i0Var.f299960a) && Intrinsics.f(this.f299961b, i0Var.f299961b);
    }

    public final int hashCode() {
        String str = this.f299960a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f299961b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public i0(String str, ArrayList arrayList) {
        this.f299960a = str;
        this.f299961b = arrayList;
    }
}
