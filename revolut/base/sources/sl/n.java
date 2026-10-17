package sl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.utils.CountryCode;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NFCOptions f264052c;
    public final LinkedHashMap d;
    public final CountryCode e;
    public final DocumentType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f264053g;

    public n(String id10, String taskDefId, NFCOptions nfcOptions, LinkedHashMap supportedDocs, CountryCode countryCode, DocumentType documentType, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        Intrinsics.checkNotNullParameter(supportedDocs, "supportedDocs");
        this.f264050a = id10;
        this.f264051b = taskDefId;
        this.f264052c = nfcOptions;
        this.d = supportedDocs;
        this.e = countryCode;
        this.f = documentType;
        this.f264053g = str;
    }

    @Override // sl.x
    public final String a() {
        return this.f264051b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f264050a, nVar.f264050a) && Intrinsics.f(this.f264051b, nVar.f264051b) && Intrinsics.f(this.f264052c, nVar.f264052c) && this.d.equals(nVar.d) && this.e == nVar.e && this.f == nVar.f && Intrinsics.f(this.f264053g, nVar.f264053g);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264050a;
    }

    public final int hashCode() {
        int iE = r6.b.e(this.d, (this.f264052c.hashCode() + p.a.c(this.f264050a.hashCode() * 31, 31, this.f264051b)) * 31, 31);
        CountryCode countryCode = this.e;
        int iHashCode = (iE + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
        DocumentType documentType = this.f;
        int iHashCode2 = (iHashCode + (documentType == null ? 0 : documentType.hashCode())) * 31;
        String str = this.f264053g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("DocumentTask(id=", this.f264050a, ", taskDefId=", this.f264051b, ", nfcOptions=");
        sbM.append(this.f264052c);
        sbM.append(", supportedDocs=");
        sbM.append(this.d);
        sbM.append(", preferredIssuingCountry=");
        sbM.append(this.e);
        sbM.append(", preferredDocumentType=");
        sbM.append(this.f);
        sbM.append(", workflowId=");
        return v0.a.i(sbM, this.f264053g, ")");
    }
}
