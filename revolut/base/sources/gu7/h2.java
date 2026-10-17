package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new d(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146758c;
    public final w1 d;

    public /* synthetic */ h2(int i, String str, String str2, String str3, w1 w1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(u1.f146839a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146756a = str;
        this.f146757b = str2;
        this.f146758c = str3;
        this.d = w1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f146756a, h2Var.f146756a) && Intrinsics.f(this.f146757b, h2Var.f146757b) && Intrinsics.f(this.f146758c, h2Var.f146758c) && Intrinsics.f(this.d, h2Var.d);
    }

    public final int hashCode() {
        String str = this.f146756a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f146757b);
        String str2 = this.f146758c;
        return this.d.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public h2(String str, String title, String str2, w1 action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f146756a = str;
        this.f146757b = title;
        this.f146758c = str2;
        this.d = action;
    }
}
