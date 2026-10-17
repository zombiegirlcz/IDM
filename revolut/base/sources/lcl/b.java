package lcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0017"}, d2 = {"Llcl/b;", "", "", "toString", "()Ljava/lang/String;", "", "Llcl/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "documents", "b", "Ljava/lang/String;", "firstNationality", "c", "d", "secondNationality", "", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "usTaxPayer", "rtlBrexitOptIn", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<a> documents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstNationality")
    private final String firstNationality;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondNationality")
    private final String secondNationality;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("usTaxPayer")
    private final Boolean usTaxPayer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rtlBrexitOptIn")
    private final Boolean rtlBrexitOptIn;

    public b(Boolean bool, Boolean bool2, String str, String str2, ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.documents = documents;
        this.firstNationality = str;
        this.secondNationality = str2;
        this.usTaxPayer = bool;
        this.rtlBrexitOptIn = bool2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstNationality() {
        return this.firstNationality;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getRtlBrexitOptIn() {
        return this.rtlBrexitOptIn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecondNationality() {
        return this.secondNationality;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getUsTaxPayer() {
        return this.usTaxPayer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.documents, bVar.documents) && Intrinsics.f(this.firstNationality, bVar.firstNationality) && Intrinsics.f(this.secondNationality, bVar.secondNationality) && Intrinsics.f(this.usTaxPayer, bVar.usTaxPayer) && Intrinsics.f(this.rtlBrexitOptIn, bVar.rtlBrexitOptIn);
    }

    public final int hashCode() {
        int iHashCode = this.documents.hashCode() * 31;
        String str = this.firstNationality;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondNationality;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.usTaxPayer;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.rtlBrexitOptIn;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
