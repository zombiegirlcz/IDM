package jxi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f179230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f179231b;

    public w(TextLocalisedClause text, LargeActionButton.ButtonStyle.FilledButton style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f179230a = text;
        this.f179231b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f179230a.equals(wVar.f179230a) && Intrinsics.f(this.f179231b, wVar.f179231b);
    }

    public final int hashCode() {
        return this.f179231b.hashCode() + (this.f179230a.hashCode() * 31);
    }
}
