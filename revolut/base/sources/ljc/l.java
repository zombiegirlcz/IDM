package ljc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f195629c;

    public l(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f195627a = items;
        this.f195628b = z;
        this.f195629c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f195627a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f195627a, lVar.f195627a) && this.f195628b == lVar.f195628b && Intrinsics.f(this.f195629c, lVar.f195629c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f195627a.hashCode() * 31, 31, this.f195628b);
        Clause clause = this.f195629c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
