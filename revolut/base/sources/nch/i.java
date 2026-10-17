package nch;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f214189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f214190b;

    public i(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f214189a = title;
        this.f214190b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        if (!this.f214189a.equals(iVar.f214189a)) {
            return false;
        }
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3) && this.f214190b.equals(iVar.f214190b);
    }

    public final int hashCode() {
        return this.f214190b.hashCode() + ((Boolean.TRUE.hashCode() + (this.f214189a.hashCode() * 31)) * 31);
    }
}
