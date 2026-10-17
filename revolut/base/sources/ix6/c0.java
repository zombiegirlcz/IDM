package ix6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f169381a;

    public c0(TextLocalisedClause buttonLabel) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f169381a = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f169381a.equals(((c0) obj2).f169381a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f169381a.hashCode() * 31);
    }
}
