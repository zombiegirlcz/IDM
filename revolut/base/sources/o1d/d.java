package o1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f221381b;

    public d(TextLocalisedClause titleClause, TextLocalisedClause actionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(actionClause, "actionClause");
        this.f221380a = titleClause;
        this.f221381b = actionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f221380a.equals(dVar.f221380a) && this.f221381b.equals(dVar.f221381b);
    }

    public final int hashCode() {
        return this.f221381b.hashCode() + (this.f221380a.hashCode() * 31);
    }
}
