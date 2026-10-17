package y1m;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310429c;
    public final List d;
    public final ArrayList e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f310430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f310431h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f310432j;
    public final a3m.e k;

    public c(List externalCharactersInCommonName, List externalCharactersInPreviousName, List externalCharactersInAliasName, List externalCharactersInAddress, ArrayList externalCharactersInConditions, String licenseEntriesRawData, String photoRawData, String registeredDomicileRawData, boolean z, b bVar, a3m.e signatureVerifyingParams) {
        Intrinsics.checkNotNullParameter(externalCharactersInCommonName, "externalCharactersInCommonName");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousName, "externalCharactersInPreviousName");
        Intrinsics.checkNotNullParameter(externalCharactersInAliasName, "externalCharactersInAliasName");
        Intrinsics.checkNotNullParameter(externalCharactersInAddress, "externalCharactersInAddress");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(licenseEntriesRawData, "licenseEntriesRawData");
        Intrinsics.checkNotNullParameter(photoRawData, "photoRawData");
        Intrinsics.checkNotNullParameter(registeredDomicileRawData, "registeredDomicileRawData");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        this.f310427a = externalCharactersInCommonName;
        this.f310428b = externalCharactersInPreviousName;
        this.f310429c = externalCharactersInAliasName;
        this.d = externalCharactersInAddress;
        this.e = externalCharactersInConditions;
        this.f = licenseEntriesRawData;
        this.f310430g = photoRawData;
        this.f310431h = registeredDomicileRawData;
        this.i = z;
        this.f310432j = bVar;
        this.k = signatureVerifyingParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f310427a, cVar.f310427a) && Intrinsics.f(this.f310428b, cVar.f310428b) && Intrinsics.f(this.f310429c, cVar.f310429c) && Intrinsics.f(this.d, cVar.d) && this.e.equals(cVar.e) && this.f.equals(cVar.f) && this.f310430g.equals(cVar.f310430g) && this.f310431h.equals(cVar.f310431h) && this.i == cVar.i && Intrinsics.f(this.f310432j, cVar.f310432j) && this.k.equals(cVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, e0.a(e0.a(e0.a(this.f310427a.hashCode() * 31, this.f310428b), this.f310429c), this.d), 31), 31, this.f), 31, this.f310430g), 31, this.f310431h), 31, this.i);
        b bVar = this.f310432j;
        return this.k.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ICChipReaderJapanSubmitDocumentRequestDriversLicense(externalCharactersInCommonName=" + this.f310427a + ", externalCharactersInPreviousName=" + this.f310428b + ", externalCharactersInAliasName=" + this.f310429c + ", externalCharactersInAddress=" + this.d + ", externalCharactersInConditions=" + this.e + ", licenseEntriesRawData=" + this.f + ", photoRawData=" + this.f310430g + ", registeredDomicileRawData=" + this.f310431h + ", hasChangedEntries=" + this.i + ", changedEntries=" + this.f310432j + ", signatureVerifyingParams=" + this.k + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
