package aw0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f10430a;

    public n(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10430a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f10430a.equals(((n) obj2).f10430a);
    }

    public final int hashCode() {
        return this.f10430a.hashCode();
    }
}
