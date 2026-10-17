package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18498c;
    public final String d;

    public /* synthetic */ p(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(n.f18495a.getDescriptor(), i, 15);
            throw null;
        }
        this.f18496a = str;
        this.f18497b = str2;
        this.f18498c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f18496a, pVar.f18496a) && Intrinsics.f(this.f18497b, pVar.f18497b) && Intrinsics.f(this.f18498c, pVar.f18498c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f18496a.hashCode() * 31, 31, this.f18497b);
        String str = this.f18498c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
