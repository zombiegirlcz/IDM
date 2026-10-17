package bvb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f18988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f18989b;

    public i(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18988a = title;
        this.f18989b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f18988a.equals(iVar.f18988a) && this.f18989b.equals(iVar.f18989b);
    }

    public final int hashCode() {
        return this.f18989b.hashCode() + (this.f18988a.hashCode() * 31);
    }
}
