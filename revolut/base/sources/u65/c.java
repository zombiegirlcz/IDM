package u65;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f277484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f277485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f277486c;

    public c(Data loanDetails, Data agreements, od0.i documents) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f277484a = loanDetails;
        this.f277485b = agreements;
        this.f277486c = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f277484a, cVar.f277484a) && Intrinsics.f(this.f277485b, cVar.f277485b) && Intrinsics.f(this.f277486c, cVar.f277486c);
    }

    public final int hashCode() {
        return this.f277486c.hashCode() + kii.e.c(this.f277485b, this.f277484a.hashCode() * 31, 31);
    }
}
