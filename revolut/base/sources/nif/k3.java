package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k3 {

    @NotNull
    public static final j3 Companion = new j3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f215900c = {null, yhm.j.c(yhm.k.PUBLICATION, new nhl.s(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215902b;

    public /* synthetic */ k3(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(i3.f215867a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215901a = str;
        this.f215902b = list;
    }

    public static k3 a(k3 k3Var, ArrayList arrayList) {
        return new k3(k3Var.f215901a, arrayList);
    }

    public final String b() {
        return this.f215901a;
    }

    public final List c() {
        return this.f215902b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f215901a, k3Var.f215901a) && Intrinsics.f(this.f215902b, k3Var.f215902b);
    }

    public final int hashCode() {
        String str = this.f215901a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f215902b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public k3(String str, List list) {
        this.f215901a = str;
        this.f215902b = list;
    }
}
