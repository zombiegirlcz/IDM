package pcd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f234896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234897c;
    public final List d;
    public final l0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f234898g;

    public /* synthetic */ u(String str, xi0.b bVar, String str2, ArrayList arrayList, l0 l0Var, String str3, t tVar, int i) {
        this(str, bVar, str2, arrayList, l0Var, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : tVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f234895a, uVar.f234895a) && Intrinsics.f(this.f234896b, uVar.f234896b) && Intrinsics.f(this.f234897c, uVar.f234897c) && Intrinsics.f(this.d, uVar.d) && this.e == uVar.e && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f234898g, uVar.f234898g);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f234896b, this.f234895a.hashCode() * 31, 31);
        String str = this.f234897c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.f234898g;
        return iHashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    public u(String name, xi0.b currency, String str, List list, l0 type, String str2, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f234895a = name;
        this.f234896b = currency;
        this.f234897c = str;
        this.d = list;
        this.e = type;
        this.f = str2;
        this.f234898g = tVar;
    }
}
