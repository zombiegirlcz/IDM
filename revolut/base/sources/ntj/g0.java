package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f219063h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219066c;
    public final String d;
    public final String e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f219067g;

    public /* synthetic */ g0(int i, String str, String str2, String str3, String str4, String str5, d0 d0Var, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(e0.f219057a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f219064a = str;
        this.f219065b = str2;
        this.f219066c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d0Var;
        this.f219067g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f219064a, g0Var.f219064a) && Intrinsics.f(this.f219065b, g0Var.f219065b) && Intrinsics.f(this.f219066c, g0Var.f219066c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f219067g, g0Var.f219067g);
    }

    public final int hashCode() {
        return this.f219067g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f219064a.hashCode() * 31, 31, this.f219065b), 31, this.f219066c), 31, this.d), 31, this.e)) * 31);
    }

    public g0(String collectionId, String type, String state, String title, String subtitle, d0 headerAsset, ArrayList items) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(headerAsset, "headerAsset");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219064a = collectionId;
        this.f219065b = type;
        this.f219066c = state;
        this.d = title;
        this.e = subtitle;
        this.f = headerAsset;
        this.f219067g = items;
    }
}
