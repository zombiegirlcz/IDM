package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i4 {

    @NotNull
    public static final h4 Companion = new h4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153146c;

    public /* synthetic */ i4(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(g4.f153117a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153144a = str;
        this.f153145b = str2;
        this.f153146c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f153144a, i4Var.f153144a) && Intrinsics.f(this.f153145b, i4Var.f153145b) && Intrinsics.f(this.f153146c, i4Var.f153146c);
    }

    public final int hashCode() {
        return this.f153146c.hashCode() + p.a.c(this.f153144a.hashCode() * 31, 31, this.f153145b);
    }
}
