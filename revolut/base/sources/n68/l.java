package n68;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f212727b;

    public l(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f212726a = title;
        this.f212727b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f212726a.equals(lVar.f212726a) && this.f212727b.equals(lVar.f212727b);
    }

    public final int hashCode() {
        return this.f212727b.hashCode() + (this.f212726a.hashCode() * 31);
    }
}
