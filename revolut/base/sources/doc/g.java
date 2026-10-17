package doc;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrendViewDelegate f116497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HeaderLoadingDelegate f116498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HeaderDelegate f116499c;
    public final TextDelegate d;
    public final TagDelegate e;
    public final FixedTabsDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullScreenStateDelegate f116500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SelectableDelegate f116501h;

    public g(TrendViewDelegate trendViewDelegate, HeaderLoadingDelegate headerLoadingDelegate, HeaderDelegate headerDelegate, TextDelegate textDelegate, TagDelegate tagDelegate, FixedTabsDelegate fixedTabsDelegate, FullScreenStateDelegate fullScreenStateDelegate, SelectableDelegate selectableDelegate) {
        Intrinsics.checkNotNullParameter(trendViewDelegate, "trendViewDelegate");
        Intrinsics.checkNotNullParameter(headerLoadingDelegate, "headerLoadingDelegate");
        Intrinsics.checkNotNullParameter(headerDelegate, "headerDelegate");
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(fixedTabsDelegate, "fixedTabsDelegate");
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        this.f116497a = trendViewDelegate;
        this.f116498b = headerLoadingDelegate;
        this.f116499c = headerDelegate;
        this.d = textDelegate;
        this.e = tagDelegate;
        this.f = fixedTabsDelegate;
        this.f116500g = fullScreenStateDelegate;
        this.f116501h = selectableDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f116497a, gVar.f116497a) && Intrinsics.f(this.f116498b, gVar.f116498b) && Intrinsics.f(this.f116499c, gVar.f116499c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f116500g, gVar.f116500g) && Intrinsics.f(this.f116501h, gVar.f116501h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f116499c.hashCode() + ((this.f116498b.hashCode() + (this.f116497a.hashCode() * 31)) * 31)) * 31)) * 31;
        TagDelegate tagDelegate = this.e;
        int iHashCode2 = (this.f116500g.hashCode() + ((this.f.hashCode() + ((iHashCode + (tagDelegate == null ? 0 : tagDelegate.hashCode())) * 31)) * 31)) * 31;
        SelectableDelegate selectableDelegate = this.f116501h;
        return iHashCode2 + (selectableDelegate != null ? selectableDelegate.hashCode() : 0);
    }
}
