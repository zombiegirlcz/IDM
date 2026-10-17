package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.v5 f165056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f165057c;

    public ko(int i, int i2, TextLocalisedClause textLocalisedClause) {
        aw0.v5 horizontalBarColor = new aw0.v5(i2);
        Intrinsics.checkNotNullParameter(horizontalBarColor, "horizontalBarColor");
        this.f165055a = i;
        this.f165056b = horizontalBarColor;
        this.f165057c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj2;
        return this.f165055a == koVar.f165055a && this.f165056b.equals(koVar.f165056b) && this.f165057c.equals(koVar.f165057c);
    }

    public final int hashCode() {
        return this.f165057c.hashCode() + j6.a.b(this.f165056b.f10572a, Integer.hashCode(this.f165055a) * 31, 961);
    }
}
