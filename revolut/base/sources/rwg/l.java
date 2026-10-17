package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257932c;
    public final String d;
    public final String e;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            j1.f(j.f257929a.getDescriptor(), i, 31);
            throw null;
        }
        this.f257930a = str;
        this.f257931b = str2;
        this.f257932c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f257930a, lVar.f257930a) && Intrinsics.f(this.f257931b, lVar.f257931b) && Intrinsics.f(this.f257932c, lVar.f257932c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f257930a.hashCode() * 31, 31, this.f257931b);
        String str = this.f257932c;
        return this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
