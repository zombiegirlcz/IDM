package cp6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f107880a;

    public c(TextLocalisedClause shotText) {
        Intrinsics.checkNotNullParameter(shotText, "shotText");
        this.f107880a = shotText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f107880a.equals(((c) obj2).f107880a);
    }

    public final int hashCode() {
        return this.f107880a.hashCode();
    }
}
