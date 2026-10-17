package fz6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f139117a;

    public k(TextLocalisedClause buttonLabel) {
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f139117a = buttonLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f139117a.equals(((k) obj2).f139117a);
    }

    public final int hashCode() {
        return this.f139117a.hashCode();
    }
}
