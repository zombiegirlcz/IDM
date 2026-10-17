package ybd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312270c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new y7k.h(12)), yhm.j.c(kVar, new y7k.h(13))};
    }

    public /* synthetic */ q0(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            j1.f(d.f312223a.getDescriptor(), i, 31);
            throw null;
        }
        this.f312268a = str;
        this.f312269b = str2;
        this.f312270c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f312268a, q0Var.f312268a) && Intrinsics.f(this.f312269b, q0Var.f312269b) && Intrinsics.f(this.f312270c, q0Var.f312270c) && Intrinsics.f(this.d, q0Var.d) && Intrinsics.f(this.e, q0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f312268a.hashCode() * 31, 31, this.f312269b);
        String str = this.f312270c;
        return this.e.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public q0(String key, String title, String str, ArrayList sections, ArrayList actions) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f312268a = key;
        this.f312269b = title;
        this.f312270c = str;
        this.d = sections;
        this.e = actions;
    }
}
