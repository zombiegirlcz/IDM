package pe0;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class e extends f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f235281l;
    public final d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f235282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f235283h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f235284j;
    public final String k;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f235281l = new Lazy[]{null, null, null, yhm.j.c(kVar, new pdg.d(15)), null, yhm.j.c(kVar, new pdg.d(16)), null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, String str, String str2, long j2, d dVar, String str3, List list, String str4, String str5, String str6, String str7) {
        super(str, str2, j2);
        if (1023 != (i & 1023)) {
            j1.f(b.f235280a.getDescriptor(), i, 1023);
            throw null;
        }
        this.e = dVar;
        this.f = str3;
        this.f235282g = list;
        this.f235283h = str4;
        this.i = str5;
        this.f235284j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f235282g, eVar.f235282g) && Intrinsics.f(this.f235283h, eVar.f235283h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f235284j, eVar.f235284j) && Intrinsics.f(this.k, eVar.k);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.e.hashCode() * 31, 31, this.f), 31, this.f235282g);
        String str = this.f235283h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f235284j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d updateType, String categoryString, List transactionGroupIds, String str, String str2, String str3, String str4) {
        super(com.google.android.gms.internal.mlkit_vision_face.a.o(categoryString, d0.k0(transactionGroupIds, null, null, null, 0, null, 63), str == null ? "" : str));
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        Intrinsics.checkNotNullParameter(categoryString, "categoryString");
        Intrinsics.checkNotNullParameter(transactionGroupIds, "transactionGroupIds");
        this.e = updateType;
        this.f = categoryString;
        this.f235282g = transactionGroupIds;
        this.f235283h = str;
        this.i = str2;
        this.f235284j = str3;
        this.k = str4;
    }
}
