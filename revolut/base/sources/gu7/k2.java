package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146777c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146779b;

    public /* synthetic */ k2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(i2.f146765a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146778a = str;
        this.f146779b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f146778a, k2Var.f146778a) && Intrinsics.f(this.f146779b, k2Var.f146779b);
    }

    public final int hashCode() {
        String str = this.f146778a;
        return this.f146779b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public k2(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146778a = str;
        this.f146779b = items;
    }
}
