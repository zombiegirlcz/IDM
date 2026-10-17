package n29;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r implements s {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new n08.b(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211491c;
    public final h d;
    public final v e;

    public /* synthetic */ r(int i, String str, String str2, String str3, h hVar, v vVar) {
        if (31 != (i & 31)) {
            j1.f(p.f211488a.getDescriptor(), i, 31);
            throw null;
        }
        this.f211489a = str;
        this.f211490b = str2;
        this.f211491c = str3;
        this.d = hVar;
        this.e = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f211489a, rVar.f211489a) && Intrinsics.f(this.f211490b, rVar.f211490b) && Intrinsics.f(this.f211491c, rVar.f211491c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211489a.hashCode() * 31, 31, this.f211490b);
        String str = this.f211491c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.d;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        v vVar = this.e;
        return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }

    public r(String header, String title, String str, h hVar, v vVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f211489a = header;
        this.f211490b = title;
        this.f211491c = str;
        this.d = hVar;
        this.e = vVar;
    }
}
