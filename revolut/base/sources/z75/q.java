package z75;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f319927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f319928b;

    public q(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f319927a = title;
        this.f319928b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f319927a.equals(qVar.f319927a) && this.f319928b.equals(qVar.f319928b);
    }

    public final int hashCode() {
        return this.f319928b.hashCode() + (this.f319927a.hashCode() * 31);
    }
}
