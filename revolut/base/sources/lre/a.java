package lre;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f199501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TermsScope f199502b;

    public a(DateTime createdDate, TermsScope scope) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f199501a = createdDate;
        this.f199502b = scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199501a, aVar.f199501a) && Intrinsics.f(this.f199502b, aVar.f199502b);
    }

    public final int hashCode() {
        return this.f199502b.f90390a.hashCode() + (this.f199501a.hashCode() * 31);
    }
}
