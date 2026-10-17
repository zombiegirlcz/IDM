package y07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f310158c;
    public final boolean d;

    public g(Data settings, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f310156a = str;
        this.f310157b = str2;
        this.f310158c = settings;
        this.d = z;
    }

    public static g a(g gVar, String str, String str2, Data settings, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = gVar.f310157b;
        }
        if ((i & 4) != 0) {
            settings = gVar.f310158c;
        }
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new g(settings, str, str2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f310156a, gVar.f310156a) && Intrinsics.f(this.f310157b, gVar.f310157b) && Intrinsics.f(this.f310158c, gVar.f310158c) && this.d == gVar.d;
    }

    public final int hashCode() {
        String str = this.f310156a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f310157b;
        return Boolean.hashCode(this.d) + kii.e.c(this.f310158c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }
}
