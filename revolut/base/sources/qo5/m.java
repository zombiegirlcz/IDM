package qo5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248044c;
    public final String d;

    public /* synthetic */ m(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(k.f248041a.getDescriptor(), i, 15);
            throw null;
        }
        this.f248042a = str;
        this.f248043b = str2;
        this.f248044c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f248042a, mVar.f248042a) && Intrinsics.f(this.f248043b, mVar.f248043b) && Intrinsics.f(this.f248044c, mVar.f248044c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f248042a.hashCode() * 31;
        String str = this.f248043b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f248044c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public m(String country, String str, String addressLine1, String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        this.f248042a = country;
        this.f248043b = str;
        this.f248044c = addressLine1;
        this.d = str2;
    }
}
