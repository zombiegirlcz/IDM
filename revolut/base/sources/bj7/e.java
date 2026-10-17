package bj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u001c"}, d2 = {"Lbj7/e;", "", "", "toString", "()Ljava/lang/String;", "", "Lbj7/c;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "data", "f", "suitabilityStatement", "c", "Ljava/lang/String;", "e", "generalInfoUrl", "Lbj7/d;", "d", "Lbj7/d;", "()Lbj7/d;", "claimsEligibilityStatement", "Lbj7/a;", "Lbj7/a;", "()Lbj7/a;", "documentsBanner", "footer", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("data")
    private final List<c> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("suitabilityStatement")
    @NotNull
    private final List<String> suitabilityStatement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("generalInfoUrl")
    private final String generalInfoUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("claimsEligibilityStatement")
    private final d claimsEligibilityStatement;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documentsBanner")
    private final a documentsBanner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    public e(ArrayList arrayList, List suitabilityStatement, String str, d dVar, a aVar, String str2) {
        Intrinsics.checkNotNullParameter(suitabilityStatement, "suitabilityStatement");
        this.data = arrayList;
        this.suitabilityStatement = suitabilityStatement;
        this.generalInfoUrl = str;
        this.claimsEligibilityStatement = dVar;
        this.documentsBanner = aVar;
        this.footer = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getClaimsEligibilityStatement() {
        return this.claimsEligibilityStatement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getDocumentsBanner() {
        return this.documentsBanner;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getGeneralInfoUrl() {
        return this.generalInfoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.data, eVar.data) && Intrinsics.f(this.suitabilityStatement, eVar.suitabilityStatement) && Intrinsics.f(this.generalInfoUrl, eVar.generalInfoUrl) && Intrinsics.f(this.claimsEligibilityStatement, eVar.claimsEligibilityStatement) && Intrinsics.f(this.documentsBanner, eVar.documentsBanner) && Intrinsics.f(this.footer, eVar.footer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSuitabilityStatement() {
        return this.suitabilityStatement;
    }

    public final int hashCode() {
        List<c> list = this.data;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.suitabilityStatement);
        String str = this.generalInfoUrl;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.claimsEligibilityStatement;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.documentsBanner;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.footer;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
