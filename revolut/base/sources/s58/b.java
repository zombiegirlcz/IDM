package s58;

import aii.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f260050a;

    public b(TextLocalisedClause actionLabel) {
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f260050a = actionLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f260050a.equals(((b) obj2).f260050a);
    }

    public final int hashCode() {
        return this.f260050a.hashCode();
    }
}
