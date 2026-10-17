package a8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f2229c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ l(int i, String str, String str2, o oVar, String str3, String str4, String str5) {
        if (47 != (i & 47)) {
            j1.f(j.f2225a.getDescriptor(), i, 47);
            throw null;
        }
        this.f2227a = str;
        this.f2228b = str2;
        this.f2229c = oVar;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f2227a, lVar.f2227a) && Intrinsics.f(this.f2228b, lVar.f2228b) && Intrinsics.f(this.f2229c, lVar.f2229c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f2229c.hashCode() + p.a.c(this.f2227a.hashCode() * 31, 31, this.f2228b)) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
