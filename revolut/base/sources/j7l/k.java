package j7l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lj7l/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "umbrellaNameType", "statementNameType", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("umbrella_product_names")
    @NotNull
    private final String umbrellaNameType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("umbrella_statement_name")
    private final String statementNameType;

    public k(String umbrellaNameType, String str) {
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        this.umbrellaNameType = umbrellaNameType;
        this.statementNameType = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStatementNameType() {
        return this.statementNameType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUmbrellaNameType() {
        return this.umbrellaNameType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.umbrellaNameType, kVar.umbrellaNameType) && Intrinsics.f(this.statementNameType, kVar.statementNameType);
    }

    public final int hashCode() {
        int iHashCode = this.umbrellaNameType.hashCode() * 31;
        String str = this.statementNameType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
