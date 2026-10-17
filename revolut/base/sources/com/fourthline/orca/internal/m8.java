package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes23.dex */
public final class m8 {
    public final z a() {
        return new z(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public final d3 b() {
        return new d3(null, null, null, null, 15, null);
    }

    public final eb c() {
        return new eb(null, null, 3, null);
    }

    public final gh d() {
        return new gh(new fh(null, null, null, null, null, null, null, null, null, null, 1023, null), new fh(null, null, null, null, null, null, null, null, null, null, 1023, null), new fh(null, null, null, null, null, null, null, null, null, null, 1023, null), new fh(null, null, null, null, null, null, null, null, null, null, 1023, null));
    }

    public final bs e() {
        return new bs(null, null, null, false, 15, null);
    }

    public final yj0 f() {
        return new yj0(new zj0(null, null, null, null, null, null, null, null, null, null, 1023, null), new zj0(null, null, null, null, null, null, null, null, null, null, 1023, null), new zj0(null, null, null, null, null, null, null, null, null, null, 1023, null), new zj0(null, null, null, null, null, null, null, null, null, null, 1023, null));
    }

    public final yz0 g() {
        return new yz0(null, 1, null);
    }

    public final b01 h() {
        return new b01(null, null, null, null, null, null, 63, null);
    }

    public final m81 i() {
        return new m81(new n81(null, null, 3, null), new n81(null, null, 3, null), new n81(null, null, 3, null), new n81(null, null, 3, null), new n81(null, null, 3, null));
    }

    public final r01 a(b01 selfieBundle) {
        Intrinsics.checkNotNullParameter(selfieBundle, "selfieBundle");
        return new r01(selfieBundle, null, 2, null);
    }

    public final gj a(gh documentBundle, yz0 secondaryDocumentsBundle, yj0 personBundleByPriority) {
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        Intrinsics.checkNotNullParameter(secondaryDocumentsBundle, "secondaryDocumentsBundle");
        Intrinsics.checkNotNullParameter(personBundleByPriority, "personBundleByPriority");
        return new gj(documentBundle, secondaryDocumentsBundle, personBundleByPriority, null, null, null, null, null, null, null, null, 0.0d, null, null, null, 32760, null);
    }

    public final cd0 a(gh documentBundle, yj0 personBundle) {
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new cd0(documentBundle, personBundle);
    }
}
