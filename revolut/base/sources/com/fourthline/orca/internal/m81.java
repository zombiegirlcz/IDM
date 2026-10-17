package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m81 implements l81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n81 f31102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n81 f31103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n81 f31104c;
    private final n81 d;
    private final n81 e;
    private final List f;

    public m81(n81 userInputTinBundle, n81 nfcTinBundle, n81 remoteOcrTinBundle, n81 localOcrTinBundle, n81 localQrTinBundle) {
        Intrinsics.checkNotNullParameter(userInputTinBundle, "userInputTinBundle");
        Intrinsics.checkNotNullParameter(nfcTinBundle, "nfcTinBundle");
        Intrinsics.checkNotNullParameter(remoteOcrTinBundle, "remoteOcrTinBundle");
        Intrinsics.checkNotNullParameter(localOcrTinBundle, "localOcrTinBundle");
        Intrinsics.checkNotNullParameter(localQrTinBundle, "localQrTinBundle");
        this.f31102a = userInputTinBundle;
        this.f31103b = nfcTinBundle;
        this.f31104c = remoteOcrTinBundle;
        this.d = localOcrTinBundle;
        this.e = localQrTinBundle;
        this.f = zhm.v.k(userInputTinBundle, nfcTinBundle, localQrTinBundle, remoteOcrTinBundle, localOcrTinBundle);
    }

    @Override // com.fourthline.orca.internal.l81
    public String a() {
        Iterator it8 = this.f.iterator();
        while (it8.hasNext()) {
            String strA = ((n81) it8.next()).a();
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean c() {
        return super.c();
    }

    @Override // com.fourthline.orca.internal.l81
    public /* bridge */ boolean d() {
        return super.d();
    }

    @Override // com.fourthline.orca.internal.l81
    public String e() {
        Iterator it8 = this.f.iterator();
        while (it8.hasNext()) {
            String strE = ((n81) it8.next()).e();
            if (strE != null) {
                return strE;
            }
        }
        return null;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m81)) {
            return false;
        }
        m81 m81Var = (m81) obj2;
        return Intrinsics.f(this.f31102a, m81Var.f31102a) && Intrinsics.f(this.f31103b, m81Var.f31103b) && Intrinsics.f(this.f31104c, m81Var.f31104c) && Intrinsics.f(this.d, m81Var.d) && Intrinsics.f(this.e, m81Var.e);
    }

    public final n81 f() {
        return this.d;
    }

    public final n81 g() {
        return this.e;
    }

    public final n81 h() {
        return this.f31103b;
    }

    public int hashCode() {
        return (((((((this.f31102a.hashCode() * 31) + this.f31103b.hashCode()) * 31) + this.f31104c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final n81 i() {
        return this.f31104c;
    }

    public final n81 j() {
        return this.f31102a;
    }

    public String toString() {
        return "TinBundleByPriority(userInputTinBundle=" + this.f31102a + ", nfcTinBundle=" + this.f31103b + ", remoteOcrTinBundle=" + this.f31104c + ", localOcrTinBundle=" + this.d + ", localQrTinBundle=" + this.e + ")";
    }
}
