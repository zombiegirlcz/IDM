package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f1 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146743c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146745b;

    public /* synthetic */ f1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(n0.f146799a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146744a = str;
        this.f146745b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f146744a, f1Var.f146744a) && Intrinsics.f(this.f146745b, f1Var.f146745b);
    }

    public final int hashCode() {
        String str = this.f146744a;
        return this.f146745b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public f1(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146744a = str;
        this.f146745b = items;
    }
}
