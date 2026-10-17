package g7d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f141180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f141181b;

    public a(TextLocalisedClause title, TextLocalisedClause content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f141180a = title;
        this.f141181b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f141180a.equals(aVar.f141180a) && this.f141181b.equals(aVar.f141181b);
    }

    public final int hashCode() {
        return this.f141181b.hashCode() + (this.f141180a.hashCode() * 31);
    }
}
