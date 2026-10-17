package su3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265637c;
    public final String d;
    public final String e;

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i) {
        this(str, str2, (i & 8) != 0 ? null : str3, (i & 32) != 0 ? null : str4, false);
    }

    public static a a(a aVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = aVar.f265635a;
        }
        String documentHtmlUrl = str;
        if ((i & 2) != 0) {
            str2 = aVar.f265636b;
        }
        String str3 = str2;
        boolean z = (i & 4) != 0 ? aVar.f265637c : true;
        String str4 = aVar.d;
        aVar.getClass();
        String str5 = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(documentHtmlUrl, "documentHtmlUrl");
        return new a(documentHtmlUrl, str3, str4, str5, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265635a, aVar.f265635a) && Intrinsics.f(this.f265636b, aVar.f265636b) && this.f265637c == aVar.f265637c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f265635a.hashCode() * 31;
        String str = this.f265636b;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f265637c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(String documentHtmlUrl, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(documentHtmlUrl, "documentHtmlUrl");
        this.f265635a = documentHtmlUrl;
        this.f265636b = str;
        this.f265637c = z;
        this.d = str2;
        this.e = str3;
    }
}
