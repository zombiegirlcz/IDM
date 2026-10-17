package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146821c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146823b;

    public /* synthetic */ r1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(k1.f146776a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146822a = str;
        this.f146823b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f146822a, r1Var.f146822a) && Intrinsics.f(this.f146823b, r1Var.f146823b);
    }

    public final int hashCode() {
        String str = this.f146822a;
        return this.f146823b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public r1(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146822a = str;
        this.f146823b = items;
    }
}
