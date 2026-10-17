package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f117844g = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(10)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f117847c;
    public final l d;
    public final s e;
    public final h7 f;

    public /* synthetic */ t(int i, String str, String str2, List list, l lVar, s sVar, h7 h7Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(d.f117626a.getDescriptor(), i, 63);
            throw null;
        }
        this.f117845a = str;
        this.f117846b = str2;
        this.f117847c = list;
        this.d = lVar;
        this.e = sVar;
        this.f = h7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f117845a, tVar.f117845a) && Intrinsics.f(this.f117846b, tVar.f117846b) && Intrinsics.f(this.f117847c, tVar.f117847c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f117845a.hashCode() * 31;
        String str = this.f117846b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f117847c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        l lVar = this.d;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.f117740a.hashCode())) * 31;
        s sVar = this.e;
        int iHashCode5 = (iHashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        h7 h7Var = this.f;
        return iHashCode5 + (h7Var != null ? h7Var.hashCode() : 0);
    }
}
