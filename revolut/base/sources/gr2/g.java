package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145835c;
    public final String d;
    public final String e;

    public /* synthetic */ g(int i, String str, String str2, String str3, String str4, String str5) {
        if (13 != (i & 13)) {
            j1.f(e.f145826a.getDescriptor(), i, 13);
            throw null;
        }
        this.f145833a = str;
        if ((i & 2) == 0) {
            this.f145834b = null;
        } else {
            this.f145834b = str2;
        }
        this.f145835c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f145833a, gVar.f145833a) && Intrinsics.f(this.f145834b, gVar.f145834b) && Intrinsics.f(this.f145835c, gVar.f145835c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f145833a.hashCode() * 31;
        String str = this.f145834b;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145835c), 31, this.d);
        String str2 = this.e;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
