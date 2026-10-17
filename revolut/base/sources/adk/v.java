package adk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f3436h = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new a92.d(13)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3439c;
    public final String d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3440g;

    public /* synthetic */ v(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(t.f3432a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f3437a = str;
        this.f3438b = str2;
        this.f3439c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.f3440g = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f3437a, vVar.f3437a) && Intrinsics.f(this.f3438b, vVar.f3438b) && Intrinsics.f(this.f3439c, vVar.f3439c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f3440g, vVar.f3440g);
    }

    public final int hashCode() {
        int iHashCode = this.f3437a.hashCode() * 31;
        String str = this.f3438b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3439c);
        String str2 = this.d;
        int iC2 = p.a.c(p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.f3440g;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }

    public v(String style, String str, String title, String str2, String buttonText, String str3, ArrayList items) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f3437a = style;
        this.f3438b = str;
        this.f3439c = title;
        this.d = str2;
        this.e = items;
        this.f = buttonText;
        this.f3440g = str3;
    }
}
