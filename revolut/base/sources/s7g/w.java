package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f260808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260810c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ w(int i, boolean z, String str, String str2, String str3, String str4, Integer num) {
        if (7 != (i & 7)) {
            qlm.j1.f(u.f260801a.getDescriptor(), i, 7);
            throw null;
        }
        this.f260808a = z;
        this.f260809b = str;
        this.f260810c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f260808a == wVar.f260808a && Intrinsics.f(this.f260809b, wVar.f260809b) && Intrinsics.f(this.f260810c, wVar.f260810c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Boolean.hashCode(this.f260808a) * 31, 31, this.f260809b), 31, this.f260810c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
