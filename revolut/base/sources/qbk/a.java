package qbk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f244371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f244372b;

    public a(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f244371a = title;
        this.f244372b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f244371a.equals(aVar.f244371a) && this.f244372b.equals(aVar.f244372b);
    }

    public final int hashCode() {
        return this.f244372b.hashCode() + (this.f244371a.hashCode() * 31);
    }
}
