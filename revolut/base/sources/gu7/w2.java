package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w2 {

    @NotNull
    public static final o2 Companion = new o2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146853c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f146855b;

    public /* synthetic */ w2(int i, String str, p2 p2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(n2.f146801a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146854a = str;
        this.f146855b = p2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f146854a, w2Var.f146854a) && Intrinsics.f(this.f146855b, w2Var.f146855b);
    }

    public final int hashCode() {
        return this.f146855b.hashCode() + (this.f146854a.hashCode() * 31);
    }

    public w2(String text, p2 action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f146854a = text;
        this.f146855b = action;
    }
}
