package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.internal.ExtensionsKt;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yj0 implements xj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj0 f35360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zj0 f35361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zj0 f35362c;
    private final zj0 d;
    private final List e;

    public yj0(zj0 userInputPersonBundle, zj0 nfcPersonBundle, zj0 remoteOcrPersonBundle, zj0 localOcrPersonBundle) {
        Intrinsics.checkNotNullParameter(userInputPersonBundle, "userInputPersonBundle");
        Intrinsics.checkNotNullParameter(nfcPersonBundle, "nfcPersonBundle");
        Intrinsics.checkNotNullParameter(remoteOcrPersonBundle, "remoteOcrPersonBundle");
        Intrinsics.checkNotNullParameter(localOcrPersonBundle, "localOcrPersonBundle");
        this.f35360a = userInputPersonBundle;
        this.f35361b = nfcPersonBundle;
        this.f35362c = remoteOcrPersonBundle;
        this.d = localOcrPersonBundle;
        this.e = zhm.v.k(userInputPersonBundle, nfcPersonBundle, remoteOcrPersonBundle, localOcrPersonBundle);
    }

    @Override // com.fourthline.orca.internal.xj0
    public String a() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strA = ((zj0) it8.next()).a();
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.xj0
    public String c() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strC = ((zj0) it8.next()).c();
            if (strC != null) {
                return strC;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.xj0
    public Date d() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            Date dateD = ((zj0) it8.next()).d();
            if (dateD != null) {
                return dateD;
            }
        }
        return null;
    }

    public final zj0 e() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj2;
        return Intrinsics.f(this.f35360a, yj0Var.f35360a) && Intrinsics.f(this.f35361b, yj0Var.f35361b) && Intrinsics.f(this.f35362c, yj0Var.f35362c) && Intrinsics.f(this.d, yj0Var.d);
    }

    @Override // com.fourthline.orca.internal.xj0
    public Gender f() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            Gender genderF = ((zj0) it8.next()).f();
            if (genderF != null) {
                return genderF;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean g() {
        return super.g();
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean h() {
        return super.h();
    }

    public int hashCode() {
        return (((((this.f35360a.hashCode() * 31) + this.f35361b.hashCode()) * 31) + this.f35362c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // com.fourthline.orca.internal.xj0
    public String i() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strI = ((zj0) it8.next()).i();
            if (strI != null) {
                return strI;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean l() {
        return super.l();
    }

    @Override // com.fourthline.orca.internal.xj0
    public /* bridge */ boolean m() {
        return super.m();
    }

    @Override // com.fourthline.orca.internal.xj0
    public String n() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strN = ((zj0) it8.next()).n();
            if (strN != null) {
                return strN;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.xj0
    public String o() {
        String strAlpha3Code;
        Iterator it8 = this.e.iterator();
        do {
            strAlpha3Code = null;
            if (!it8.hasNext()) {
                break;
            }
            String strO = ((zj0) it8.next()).o();
            if (strO != null) {
                strAlpha3Code = ExtensionsKt.alpha3Code(strO);
            }
        } while (strAlpha3Code == null);
        return strAlpha3Code;
    }

    @Override // com.fourthline.orca.internal.xj0
    public String q() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strQ = ((zj0) it8.next()).q();
            if (strQ != null) {
                return strQ;
            }
        }
        return null;
    }

    public final zj0 r() {
        return this.f35361b;
    }

    public final zj0 s() {
        return this.f35362c;
    }

    public final zj0 t() {
        return this.f35360a;
    }

    public String toString() {
        return "PersonBundleByPriority(userInputPersonBundle=" + this.f35360a + ", nfcPersonBundle=" + this.f35361b + ", remoteOcrPersonBundle=" + this.f35362c + ", localOcrPersonBundle=" + this.d + ")";
    }
}
