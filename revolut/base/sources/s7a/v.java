package s7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f260644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f260645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f260646c;
    public final Integer d;

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(15, null, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f260644a, vVar.f260644a) && Intrinsics.f(this.f260645b, vVar.f260645b) && Intrinsics.f(this.f260646c, vVar.f260646c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f260644a.hashCode() * 31;
        Integer num = this.f260645b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Clause clause = this.f260646c;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public v(TextLocalisedClause title, Integer num, Clause clause, Integer num2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f260644a = title;
        this.f260645b = num;
        this.f260646c = clause;
        this.d = num2;
    }

    public /* synthetic */ v(int i, TextLocalisedClause textLocalisedClause, Integer num) {
        this(new TextLocalisedClause(R$string.search_empty_title, null, null, 14), (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : textLocalisedClause, null);
    }
}
