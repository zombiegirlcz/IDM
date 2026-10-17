package com.revolut.feature.insurance_embedded.impl.data.model;

import gu7.b5;
import gu7.h5;
import gu7.i5;
import gu7.l5;
import gu7.v1;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f76021h = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(23)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l5 f76024c;
    public final SchemeInsuranceActivateCoverageWidget d;
    public final List e;
    public final h5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b5 f76025g;

    public /* synthetic */ o0(int i, String str, String str2, l5 l5Var, SchemeInsuranceActivateCoverageWidget schemeInsuranceActivateCoverageWidget, List list, h5 h5Var, b5 b5Var) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(n0.f76017a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f76022a = str;
        this.f76023b = str2;
        this.f76024c = l5Var;
        this.d = schemeInsuranceActivateCoverageWidget;
        this.e = list;
        this.f = h5Var;
        this.f76025g = b5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f76022a, o0Var.f76022a) && Intrinsics.f(this.f76023b, o0Var.f76023b) && Intrinsics.f(this.f76024c, o0Var.f76024c) && Intrinsics.f(this.d, o0Var.d) && Intrinsics.f(this.e, o0Var.e) && Intrinsics.f(this.f, o0Var.f) && Intrinsics.f(this.f76025g, o0Var.f76025g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f76022a.hashCode() * 31, 31, this.f76023b);
        l5 l5Var = this.f76024c;
        int iHashCode = (iC + (l5Var == null ? 0 : l5Var.hashCode())) * 31;
        SchemeInsuranceActivateCoverageWidget schemeInsuranceActivateCoverageWidget = this.d;
        int iHashCode2 = (iHashCode + (schemeInsuranceActivateCoverageWidget == null ? 0 : schemeInsuranceActivateCoverageWidget.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        h5 h5Var = this.f;
        int iHashCode4 = (iHashCode3 + (h5Var == null ? 0 : h5Var.hashCode())) * 31;
        b5 b5Var = this.f76025g;
        return iHashCode4 + (b5Var != null ? b5Var.hashCode() : 0);
    }
}
