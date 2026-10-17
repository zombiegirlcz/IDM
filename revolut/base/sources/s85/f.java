package s85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f260890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f260891c;

    public f(Data loanBackupCard, Data loanDetails, String loanId) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(loanBackupCard, "loanBackupCard");
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f260889a = loanId;
        this.f260890b = loanBackupCard;
        this.f260891c = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f260889a, fVar.f260889a) && Intrinsics.f(this.f260890b, fVar.f260890b) && Intrinsics.f(this.f260891c, fVar.f260891c);
    }

    public final int hashCode() {
        return this.f260891c.hashCode() + kii.e.c(this.f260890b, this.f260889a.hashCode() * 31, 31);
    }
}
