package z9j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f320501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f320502b;

    public b(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f320501a = title;
        this.f320502b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f320501a.equals(bVar.f320501a) && this.f320502b.equals(bVar.f320502b);
    }

    public final int hashCode() {
        return this.f320502b.hashCode() + (this.f320501a.hashCode() * 31);
    }
}
