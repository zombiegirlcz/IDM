package mn1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f207347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f207348b;

    public p(TextLocalisedClause submitButtonTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(submitButtonTitle, "submitButtonTitle");
        this.f207347a = items;
        this.f207348b = submitButtonTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f207347a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f207347a.equals(pVar.f207347a) && this.f207348b.equals(pVar.f207348b);
    }

    public final int hashCode() {
        return this.f207348b.hashCode() + (this.f207347a.hashCode() * 31);
    }
}
