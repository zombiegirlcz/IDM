package c07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f20186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f20187b;

    public c(TextLocalisedClause label, LargeActionButton.ButtonStyle.DefaultFilledButton style) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f20186a = label;
        this.f20187b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f20186a.equals(cVar.f20186a) && Intrinsics.f(this.f20187b, cVar.f20187b);
    }

    public final int hashCode() {
        return this.f20187b.hashCode() + (this.f20186a.hashCode() * 31);
    }
}
