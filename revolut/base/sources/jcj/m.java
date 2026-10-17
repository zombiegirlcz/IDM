package jcj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f172832b;

    public m(TextLocalisedClause submitButtonClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f172831a = items;
        this.f172832b = submitButtonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f172831a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f172831a.equals(mVar.f172831a) && this.f172832b.equals(mVar.f172832b);
    }

    public final int hashCode() {
        return this.f172832b.hashCode() + (this.f172831a.hashCode() * 31);
    }
}
