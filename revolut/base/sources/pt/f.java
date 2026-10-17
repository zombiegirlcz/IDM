package pt;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f239555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocumentType f239556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f239557c;
    public final List d;
    public final AnalyticsContext e;

    public f(wi0.b currentCountry, BiometricVerificationDocumentType currentDocument, ArrayList availableDocuments, List availableCountries, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        Intrinsics.checkNotNullParameter(currentDocument, "currentDocument");
        Intrinsics.checkNotNullParameter(availableDocuments, "availableDocuments");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        this.f239555a = currentCountry;
        this.f239556b = currentDocument;
        this.f239557c = availableDocuments;
        this.d = availableCountries;
        this.e = analyticsContext;
    }

    public static f a(f fVar, wi0.b currentCountry, BiometricVerificationDocumentType currentDocument) {
        ArrayList availableDocuments = fVar.f239557c;
        List availableCountries = fVar.d;
        AnalyticsContext analyticsContext = fVar.e;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        Intrinsics.checkNotNullParameter(currentDocument, "currentDocument");
        Intrinsics.checkNotNullParameter(availableDocuments, "availableDocuments");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        return new f(currentCountry, currentDocument, availableDocuments, availableCountries, analyticsContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239555a, fVar.f239555a) && Intrinsics.f(this.f239556b, fVar.f239556b) && this.f239557c.equals(fVar.f239557c) && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f239557c, (this.f239556b.hashCode() + (this.f239555a.f297794a.hashCode() * 31)) * 31, 31), 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
