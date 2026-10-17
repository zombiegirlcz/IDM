package rnj;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f255707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255708b;

    public f(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255707a = textLocalisedClause;
        this.f255708b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255708b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f255707a, fVar.f255707a) && Intrinsics.f(this.f255708b, fVar.f255708b);
    }

    public final int hashCode() {
        Clause clause = this.f255707a;
        return this.f255708b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
