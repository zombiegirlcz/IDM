package l7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.b f192609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192610c;
    public final String d;
    public final String e;
    public final Integer f;

    public i(boolean z, m7g.b type, String description, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f192608a = z;
        this.f192609b = type;
        this.f192610c = description;
        this.d = str;
        this.e = str2;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f192608a == iVar.f192608a && this.f192609b == iVar.f192609b && Intrinsics.f(this.f192610c, iVar.f192610c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f192609b.hashCode() + (Boolean.hashCode(this.f192608a) * 31)) * 31, 31, this.f192610c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
