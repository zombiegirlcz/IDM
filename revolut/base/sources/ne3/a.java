package ne3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lne3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCategoryString", "categoryString", "", "b", "Ljava/util/List;", "getTransactionGroupIds", "()Ljava/util/List;", "transactionGroupIds", "c", "getWalletId", "walletId", "feature_categorization_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tag")
    @NotNull
    private final String categoryString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionGroupIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    private final String walletId;

    public a(String categoryString, List transactionGroupIds, String str) {
        Intrinsics.checkNotNullParameter(categoryString, "categoryString");
        Intrinsics.checkNotNullParameter(transactionGroupIds, "transactionGroupIds");
        this.categoryString = categoryString;
        this.transactionGroupIds = transactionGroupIds;
        this.walletId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.categoryString, aVar.categoryString) && Intrinsics.f(this.transactionGroupIds, aVar.transactionGroupIds) && Intrinsics.f(this.walletId, aVar.walletId);
    }

    public final int hashCode() {
        int iD = p.a.d(this.categoryString.hashCode() * 31, 31, this.transactionGroupIds);
        String str = this.walletId;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
