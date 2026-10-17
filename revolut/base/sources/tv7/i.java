package tv7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f274724c;

    public i(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274722a = items;
        this.f274723b = z;
        this.f274724c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f274722a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f274722a, iVar.f274722a) && this.f274723b == iVar.f274723b && Intrinsics.f(this.f274724c, iVar.f274724c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f274722a.hashCode() * 31, 31, this.f274723b);
        Clause clause = this.f274724c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
