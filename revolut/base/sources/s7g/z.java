package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f260818h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260821c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f260822g;

    public /* synthetic */ z(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(x.f260812a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260819a = str;
        this.f260820b = str2;
        if ((i & 4) == 0) {
            this.f260821c = null;
        } else {
            this.f260821c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.f260822g = null;
        } else {
            this.f260822g = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f260819a, zVar.f260819a) && Intrinsics.f(this.f260820b, zVar.f260820b) && Intrinsics.f(this.f260821c, zVar.f260821c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f260822g, zVar.f260822g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260819a.hashCode() * 31, 31, this.f260820b);
        String str = this.f260821c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f260822g;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
