package m4j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f202735c;
    public final BankFieldDefinition d;

    public f(String searchQuery, List searchItems, Clause title, BankFieldDefinition bankFieldDefinition) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
        this.f202733a = searchQuery;
        this.f202734b = searchItems;
        this.f202735c = title;
        this.d = bankFieldDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f202733a, fVar.f202733a) && Intrinsics.f(this.f202734b, fVar.f202734b) && Intrinsics.f(this.f202735c, fVar.f202735c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.d(this.f202733a.hashCode() * 31, 31, this.f202734b), 31, this.f202735c);
    }
}
