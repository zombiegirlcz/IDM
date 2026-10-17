package rg8;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionWidgetDelegate.Model.a f254043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f254044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f254045c;
    public final CircleIconBadge d;

    public b(ActionWidgetDelegate.Model.a buttonStyle, Custom custom, Clause secondaryText, CircleIconBadge bottomEndBadge) {
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(bottomEndBadge, "bottomEndBadge");
        this.f254043a = buttonStyle;
        this.f254044b = custom;
        this.f254045c = secondaryText;
        this.d = bottomEndBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f254043a.equals(bVar.f254043a) && Intrinsics.f(this.f254044b, bVar.f254044b) && this.f254045c.equals(bVar.f254045c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f254043a.hashCode() * 31;
        Style style = this.f254044b;
        return this.d.hashCode() + p.a.b((iHashCode + (style == null ? 0 : style.hashCode())) * 31, 31, this.f254045c);
    }
}
