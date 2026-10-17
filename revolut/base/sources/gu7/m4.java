package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m4 {

    @NotNull
    public static final l4 Companion = new l4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146794c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f146796b;

    public /* synthetic */ m4(int i, dl7.a aVar, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(k4.f146781a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146795a = str;
        this.f146796b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f146795a, m4Var.f146795a) && this.f146796b == m4Var.f146796b;
    }

    public final int hashCode() {
        return this.f146796b.hashCode() + (this.f146795a.hashCode() * 31);
    }
}
