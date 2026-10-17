package pv7;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f239995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f239996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f239997c;
    public final AnimatedBackgroundType d;

    public r(List items, o header, TextClause textClause, AnimatedBackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f239995a = items;
        this.f239996b = header;
        this.f239997c = textClause;
        this.d = backgroundType;
    }

    @Override // cli.p
    public final List c() {
        return this.f239995a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f239995a, rVar.f239995a) && Intrinsics.f(this.f239996b, rVar.f239996b) && Intrinsics.f(this.f239997c, rVar.f239997c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f239996b.hashCode() + (this.f239995a.hashCode() * 31)) * 31;
        Clause clause = this.f239997c;
        return this.d.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public /* synthetic */ r(List list, o oVar) {
        this(list, oVar, null, AnimatedBackgroundType.DEFAULT.f51471a);
    }
}
