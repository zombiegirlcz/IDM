package mp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class g implements h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f207730h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fs3.b f207732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207733c;
    public final String d;
    public final Integer e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f207734g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f207730h = new Lazy[]{null, yhm.j.c(kVar, new mp.e(27)), null, null, null, null, yhm.j.c(kVar, new mp.e(28))};
    }

    public /* synthetic */ g(int i, String str, fs3.b bVar, String str2, String str3, Integer num, String str4, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(e.f207729a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f207731a = str;
        this.f207732b = bVar;
        this.f207733c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.f207734g = list;
    }

    @Override // mp3.h
    public final fs3.b a() {
        return this.f207732b;
    }

    @Override // mp3.h
    public final String b() {
        return this.f;
    }

    @Override // mp3.h
    public final String c() {
        return this.d;
    }

    @Override // mp3.h
    public final Integer d() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f207731a, gVar.f207731a) && this.f207732b == gVar.f207732b && Intrinsics.f(this.f207733c, gVar.f207733c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f207734g, gVar.f207734g);
    }

    @Override // mp3.h
    public final String getTitle() {
        return this.f207733c;
    }

    public final int hashCode() {
        int iHashCode = (this.f207732b.hashCode() + (this.f207731a.hashCode() * 31)) * 31;
        String str = this.f207733c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        return this.f207734g.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // mp3.h
    public final List p() {
        return this.f207734g;
    }

    public g(String itemId, fs3.b entryPoint, String str, String str2, Integer num, String str3, ArrayList tags) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f207731a = itemId;
        this.f207732b = entryPoint;
        this.f207733c = str;
        this.d = str2;
        this.e = num;
        this.f = str3;
        this.f207734g = tags;
    }
}
