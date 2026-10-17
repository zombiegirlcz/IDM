package g57;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140679a;

    public n(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f140679a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f140679a.equals(((n) obj2).f140679a);
    }

    public final int hashCode() {
        return this.f140679a.hashCode();
    }
}
