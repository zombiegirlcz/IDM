package wrd;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f299552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f299553b;

    public b(TextLocalisedClause title, TextClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f299552a = title;
        this.f299553b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f299552a.equals(bVar.f299552a) && this.f299553b.equals(bVar.f299553b);
    }

    public final int hashCode() {
        return this.f299553b.hashCode() + (this.f299552a.hashCode() * 31);
    }
}
