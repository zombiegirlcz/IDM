package rs;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f256897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f256898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f256899c;

    public q(TextLocalisedClause text, LargeActionButton.ButtonStyle.DefaultFilledButton style, String loadingTag) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(loadingTag, "loadingTag");
        this.f256897a = text;
        this.f256898b = style;
        this.f256899c = loadingTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f256897a.equals(qVar.f256897a) && Intrinsics.f(this.f256898b, qVar.f256898b) && this.f256899c.equals(qVar.f256899c);
    }

    public final int hashCode() {
        return this.f256899c.hashCode() + r6.b.d(this.f256898b, this.f256897a.hashCode() * 31, 31);
    }
}
