package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l5 {

    @NotNull
    public static final k5 Companion = new k5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146789c;

    public /* synthetic */ l5(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(j5.f146774a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146787a = str;
        this.f146788b = str2;
        this.f146789c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj2;
        return Intrinsics.f(this.f146787a, l5Var.f146787a) && Intrinsics.f(this.f146788b, l5Var.f146788b) && Intrinsics.f(this.f146789c, l5Var.f146789c);
    }

    public final int hashCode() {
        return this.f146789c.hashCode() + p.a.c(this.f146787a.hashCode() * 31, 31, this.f146788b);
    }
}
