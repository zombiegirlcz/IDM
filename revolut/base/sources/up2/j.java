package up2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f281824c;

    public j(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281822a = items;
        this.f281823b = z;
        this.f281824c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f281822a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f281822a, jVar.f281822a) && this.f281823b == jVar.f281823b && Intrinsics.f(this.f281824c, jVar.f281824c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f281822a.hashCode() * 31, 31, this.f281823b);
        Clause clause = this.f281824c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
