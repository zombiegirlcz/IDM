package yph;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate f315897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsDelegate f315898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RangeSliderTitleDelegate f315899c;
    public final SelectableDelegate d;

    public g(ListSubheaderDelegate listSubheaderDelegate, ActionsDelegate actionsDelegate, RangeSliderTitleDelegate rangeSliderTitleDelegate, SelectableDelegate selectableDelegate) {
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(actionsDelegate, "actionsDelegate");
        Intrinsics.checkNotNullParameter(rangeSliderTitleDelegate, "rangeSliderTitleDelegate");
        Intrinsics.checkNotNullParameter(selectableDelegate, "selectableDelegate");
        this.f315897a = listSubheaderDelegate;
        this.f315898b = actionsDelegate;
        this.f315899c = rangeSliderTitleDelegate;
        this.d = selectableDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f315897a, gVar.f315897a) && Intrinsics.f(this.f315898b, gVar.f315898b) && Intrinsics.f(this.f315899c, gVar.f315899c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f315899c.hashCode() + ((this.f315898b.hashCode() + (this.f315897a.hashCode() * 31)) * 31)) * 31);
    }
}
