package bnh;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f17205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionWidgetDelegate f17206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f17207c;
    public final HeroBannerDelegate d;

    public o(ListSubheaderDelegate listSubheaderDelegate, ActionWidgetDelegate actionWidgetDelegate, RowDelegate rowDelegate, HeroBannerDelegate bannerDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(actionWidgetDelegate, "actionWidgetDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(bannerDelegate, "bannerDelegate");
        this.f17205a = listSubheaderDelegate;
        this.f17206b = actionWidgetDelegate;
        this.f17207c = rowDelegate;
        this.d = bannerDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f17205a, oVar.f17205a) && Intrinsics.f(this.f17206b, oVar.f17206b) && Intrinsics.f(this.f17207c, oVar.f17207c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f17207c.hashCode() + ((this.f17206b.hashCode() + (this.f17205a.hashCode() * 31)) * 31)) * 31);
    }
}
