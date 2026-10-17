package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.core.ProductConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class um implements ProductConfig, ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f34126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj f34128c;
    private final ye1 d;
    private final boolean e;
    private final double f;

    public um(DocumentType type, String str, dj flowConfig, ye1 tenantConfig) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        this.f34126a = type;
        this.f34127b = str;
        this.f34128c = flowConfig;
        this.d = tenantConfig;
        this.e = flowConfig.getDocumentStrategy().a(wk.f34723a.d()) ? false : flowConfig.getConfirmation().getEnabled();
        this.f = flowConfig.getImageCapture().a();
    }

    @Override // com.fourthline.orca.internal.ny
    public mh0 a() {
        return new hh(this);
    }

    public final dj b() {
        return this.f34128c;
    }

    public final double c() {
        return this.f;
    }

    public final String d() {
        return this.f34127b;
    }

    public final ye1 e() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof um)) {
            return false;
        }
        um umVar = (um) obj2;
        return this.f34126a == umVar.f34126a && Intrinsics.f(this.f34127b, umVar.f34127b) && Intrinsics.f(this.f34128c, umVar.f34128c) && Intrinsics.f(this.d, umVar.d);
    }

    public final DocumentType f() {
        return this.f34126a;
    }

    public final boolean g() {
        if (i()) {
            return this.f34128c.getIb.b.Analysis java.lang.String().getEnabled();
        }
        return false;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = this.f34126a.hashCode() * 31;
        String str = this.f34127b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f34128c.hashCode()) * 31) + this.d.hashCode();
    }

    public final boolean i() {
        DocumentType documentType = this.f34126a;
        return (documentType == DocumentType.TIN_REFERENCE_DOCUMENT || documentType == DocumentType.PROOF_OF_ADDRESS) ? false : true;
    }

    public final boolean j() {
        DocumentType documentType = this.f34126a;
        return (documentType == DocumentType.TIN_REFERENCE_DOCUMENT || documentType == DocumentType.PROOF_OF_ADDRESS) ? false : true;
    }

    public String toString() {
        return "DocumentProductConfig(type=" + this.f34126a + ", issuingCountry=" + this.f34127b + ", flowConfig=" + this.f34128c + ", tenantConfig=" + this.d + ")";
    }
}
