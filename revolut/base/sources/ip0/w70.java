package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w70 implements x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f166948a;

    public w70(TextLocalisedClause actionButtonLabel) {
        Intrinsics.checkNotNullParameter(actionButtonLabel, "actionButtonLabel");
        this.f166948a = actionButtonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w70) && this.f166948a.equals(((w70) obj2).f166948a);
    }

    public final int hashCode() {
        return this.f166948a.hashCode();
    }
}
