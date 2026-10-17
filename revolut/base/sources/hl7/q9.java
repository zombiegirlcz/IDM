package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q9 {

    @NotNull
    public static final p9 Companion = new p9();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f153272h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153275c;
    public final boolean d;
    public final n6 e;
    public final f7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f153276g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f153272h = new Lazy[]{null, null, yhm.j.c(kVar, new q0(26)), null, null, null, yhm.j.c(kVar, new q0(27))};
    }

    public /* synthetic */ q9(int i, String str, String str2, List list, boolean z, n6 n6Var, f7 f7Var, List list2) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(o9.f153246a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f153273a = str;
        this.f153274b = str2;
        this.f153275c = list;
        this.d = z;
        this.e = n6Var;
        this.f = f7Var;
        this.f153276g = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj2;
        return Intrinsics.f(this.f153273a, q9Var.f153273a) && Intrinsics.f(this.f153274b, q9Var.f153274b) && Intrinsics.f(this.f153275c, q9Var.f153275c) && this.d == q9Var.d && Intrinsics.f(this.e, q9Var.e) && Intrinsics.f(this.f, q9Var.f) && Intrinsics.f(this.f153276g, q9Var.f153276g);
    }

    public final int hashCode() {
        return this.f153276g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + j6.a.c(p.a.d(p.a.c(this.f153273a.hashCode() * 31, 31, this.f153274b), 31, this.f153275c), 31, this.d)) * 31)) * 31);
    }
}
