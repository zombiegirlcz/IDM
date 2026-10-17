package u58;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f277398c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ c(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(a.f277395a.getDescriptor(), i, 63);
            throw null;
        }
        this.f277396a = str;
        this.f277397b = str2;
        this.f277398c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f277396a, cVar.f277396a) && Intrinsics.f(this.f277397b, cVar.f277397b) && Intrinsics.f(this.f277398c, cVar.f277398c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        String str = this.f277396a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f277397b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f277398c;
        return this.f.hashCode() + p.a.c(p.a.c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public c(String str, String str2, String str3, String juniorCode, String relationship, String gender) {
        Intrinsics.checkNotNullParameter(juniorCode, "juniorCode");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f277396a = str;
        this.f277397b = str2;
        this.f277398c = str3;
        this.d = juniorCode;
        this.e = relationship;
        this.f = gender;
    }
}
