package xg3;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import xda.z;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class j {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new z(13)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f305493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f305494c;
    public final String d;
    public final String e;

    public /* synthetic */ j(int i, String str, String str2, i iVar, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(g.f305491a.getDescriptor(), i, 31);
            throw null;
        }
        this.f305492a = str;
        this.f305493b = str2;
        this.f305494c = iVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f305492a, jVar.f305492a) && Intrinsics.f(this.f305493b, jVar.f305493b) && this.f305494c == jVar.f305494c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f305492a.hashCode() * 31;
        String str = this.f305493b;
        int iC = p.a.c((this.f305494c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        String str2 = this.e;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
