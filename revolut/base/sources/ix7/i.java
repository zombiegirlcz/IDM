package ix7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lix7/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "quotesRequestId", "", "Lix7/c0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "quotes", "newPriceStartDate", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("quotesRequestId")
    private final String quotesRequestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("quotes")
    @NotNull
    private final List<c0> quotes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("newPriceStartDate")
    private final String newPriceStartDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNewPriceStartDate() {
        return this.newPriceStartDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getQuotes() {
        return this.quotes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQuotesRequestId() {
        return this.quotesRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.quotesRequestId, iVar.quotesRequestId) && Intrinsics.f(this.quotes, iVar.quotes) && Intrinsics.f(this.newPriceStartDate, iVar.newPriceStartDate);
    }

    public final int hashCode() {
        String str = this.quotesRequestId;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.quotes);
        String str2 = this.newPriceStartDate;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
