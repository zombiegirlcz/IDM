package rbh;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f253066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253067b;

    public e(TransferSubjectId transferSubjectId, String str) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        this.f253066a = transferSubjectId;
        this.f253067b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f253066a, eVar.f253066a) && Intrinsics.f(this.f253067b, eVar.f253067b);
    }

    public final int hashCode() {
        int iHashCode = this.f253066a.hashCode() * 31;
        String str = this.f253067b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
