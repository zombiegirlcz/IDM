package ny3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f220655c;
    public final List d;
    public final String e;
    public final String f;

    public o(String title, String str, n nVar, List groupItems, String str2, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(groupItems, "groupItems");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f220653a = title;
        this.f220654b = str;
        this.f220655c = nVar;
        this.d = groupItems;
        this.e = str2;
        this.f = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f220653a, oVar.f220653a) && Intrinsics.f(this.f220654b, oVar.f220654b) && Intrinsics.f(this.f220655c, oVar.f220655c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f220653a.hashCode() * 31;
        String str = this.f220654b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n nVar = this.f220655c;
        int iD = p.a.d((iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.f.hashCode() + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
