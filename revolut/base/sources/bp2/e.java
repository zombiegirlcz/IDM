package bp2;

import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankInformation f17547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankInformation f17548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17549c;
    public final List d;
    public final List e;

    public e(BankInformation fromBank, BankInformation toBank, List documents, List terms, List sections) {
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        Intrinsics.checkNotNullParameter(toBank, "toBank");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f17547a = fromBank;
        this.f17548b = toBank;
        this.f17549c = documents;
        this.d = terms;
        this.e = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f17547a, eVar.f17547a) && Intrinsics.f(this.f17548b, eVar.f17548b) && Intrinsics.f(this.f17549c, eVar.f17549c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.d((this.f17548b.hashCode() + (this.f17547a.hashCode() * 31)) * 31, 31, this.f17549c), 31, this.d);
    }
}
