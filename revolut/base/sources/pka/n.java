package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236979c;
    public final Boolean d;
    public final String e;
    public final String f;

    public /* synthetic */ n(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            j1.f(l.f236974a.getDescriptor(), i, 63);
            throw null;
        }
        this.f236977a = str;
        this.f236978b = str2;
        this.f236979c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f236977a, nVar.f236977a) && Intrinsics.f(this.f236978b, nVar.f236978b) && Intrinsics.f(this.f236979c, nVar.f236979c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        String str = this.f236977a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f236978b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f236979c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public n(String str, String str2, Boolean bool, String str3, String str4, String asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f236977a = str;
        this.f236978b = str2;
        this.f236979c = str3;
        this.d = bool;
        this.e = str4;
        this.f = asset;
    }
}
