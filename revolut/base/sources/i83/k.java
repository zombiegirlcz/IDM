package i83;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f159424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f159425c;

    public k(List items, TextLocalisedClause textLocalisedClause, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159423a = items;
        this.f159424b = textLocalisedClause;
        this.f159425c = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f159423a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f159423a, kVar.f159423a) && Intrinsics.f(this.f159424b, kVar.f159424b) && Intrinsics.f(this.f159425c, kVar.f159425c);
    }

    public final int hashCode() {
        int iHashCode = this.f159423a.hashCode() * 31;
        Clause clause = this.f159424b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Integer num = this.f159425c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
