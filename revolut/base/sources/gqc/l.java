package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f145650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145652c;
    public final String d;

    public /* synthetic */ l(int i, a0 a0Var, String str, String str2, String str3) {
        if (11 != (i & 11)) {
            j1.f(j.f145639a.getDescriptor(), i, 11);
            throw null;
        }
        this.f145650a = a0Var;
        this.f145651b = str;
        if ((i & 4) == 0) {
            this.f145652c = null;
        } else {
            this.f145652c = str2;
        }
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f145650a, lVar.f145650a) && Intrinsics.f(this.f145651b, lVar.f145651b) && Intrinsics.f(this.f145652c, lVar.f145652c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f145650a.hashCode() * 31, 31, this.f145651b);
        String str = this.f145652c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
