package tqi;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tqi.a f273602c;
    public final boolean d;
    public final String e;

    public static final class a {
        private a() {
        }
    }

    public c() {
        this(null, null, null, null, CertificateBody.profileType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273600a, cVar.f273600a) && Intrinsics.f(this.f273601b, cVar.f273601b) && Intrinsics.f(this.f273602c, cVar.f273602c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        String str = this.f273600a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273601b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tqi.a aVar = this.f273602c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 961, 31, this.d);
    }

    public c(String str, String str2, tqi.a aVar, String type, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        aVar = (i & 8) != 0 ? null : aVar;
        boolean z = (i & 32) != 0;
        type = (i & 64) != 0 ? "text/plain" : type;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f273600a = str;
        this.f273601b = str2;
        this.f273602c = aVar;
        this.d = z;
        this.e = type;
    }
}
