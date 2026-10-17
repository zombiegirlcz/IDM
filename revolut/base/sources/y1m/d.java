package y1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3m.e f310435c;

    public d(String expireDate, String cardPrintInfoAllRawData, a3m.e signatureVerifyingParams) {
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cardPrintInfoAllRawData, "cardPrintInfoAllRawData");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        this.f310433a = expireDate;
        this.f310434b = cardPrintInfoAllRawData;
        this.f310435c = signatureVerifyingParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f310433a, dVar.f310433a) && Intrinsics.f(this.f310434b, dVar.f310434b) && Intrinsics.f(this.f310435c, dVar.f310435c);
    }

    public final int hashCode() {
        return this.f310435c.hashCode() + w0.a(this.f310434b, this.f310433a.hashCode() * 31);
    }

    public final String toString() {
        return "ICChipReaderJapanSubmitDocumentRequestIndividualNumberCard(expireDate=" + this.f310433a + ", cardPrintInfoAllRawData=" + this.f310434b + ", signatureVerifyingParams=" + this.f310435c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
