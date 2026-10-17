package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j4 {

    @NotNull
    public static final i4 Companion = new i4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146773c;
    public final a d;

    public /* synthetic */ j4(int i, String str, String str2, String str3, a aVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(h4.f146760a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146771a = str;
        this.f146772b = str2;
        this.f146773c = str3;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return Intrinsics.f(this.f146771a, j4Var.f146771a) && Intrinsics.f(this.f146772b, j4Var.f146772b) && Intrinsics.f(this.f146773c, j4Var.f146773c) && Intrinsics.f(this.d, j4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f146771a.hashCode() * 31, 31, this.f146772b), 31, this.f146773c);
    }
}
