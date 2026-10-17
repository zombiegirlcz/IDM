package jlc;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ForecastDelegate f175677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ForecastLoadingDelegate f175678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrendViewDelegate f175679c;
    public final TextDelegate d;
    public final InputSliderDelegate e;
    public final LargeActionButtonDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButtonDelegate f175680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActionWidgetDelegate f175681h;

    public e(ForecastDelegate forecastDelegate, ForecastLoadingDelegate forecastLoadingDelegate, TrendViewDelegate trendViewDelegate, TextDelegate textDelegate, InputSliderDelegate inputSliderDelegate, LargeActionButtonDelegate largeActionButtonDelegate, SmallActionButtonDelegate smallActionButtonDelegate, ActionWidgetDelegate actionWidgetDelegate) {
        Intrinsics.checkNotNullParameter(forecastDelegate, "forecastDelegate");
        Intrinsics.checkNotNullParameter(forecastLoadingDelegate, "forecastLoadingDelegate");
        Intrinsics.checkNotNullParameter(trendViewDelegate, "trendViewDelegate");
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        this.f175677a = forecastDelegate;
        this.f175678b = forecastLoadingDelegate;
        this.f175679c = trendViewDelegate;
        this.d = textDelegate;
        this.e = inputSliderDelegate;
        this.f = largeActionButtonDelegate;
        this.f175680g = smallActionButtonDelegate;
        this.f175681h = actionWidgetDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f175677a, eVar.f175677a) && Intrinsics.f(this.f175678b, eVar.f175678b) && Intrinsics.f(this.f175679c, eVar.f175679c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f175680g, eVar.f175680g) && Intrinsics.f(this.f175681h, eVar.f175681h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f175679c.hashCode() + ((this.f175678b.hashCode() + (this.f175677a.hashCode() * 31)) * 31)) * 31)) * 31;
        InputSliderDelegate inputSliderDelegate = this.e;
        int iHashCode2 = (iHashCode + (inputSliderDelegate == null ? 0 : inputSliderDelegate.hashCode())) * 31;
        LargeActionButtonDelegate largeActionButtonDelegate = this.f;
        int iHashCode3 = (iHashCode2 + (largeActionButtonDelegate == null ? 0 : largeActionButtonDelegate.hashCode())) * 31;
        SmallActionButtonDelegate smallActionButtonDelegate = this.f175680g;
        int iHashCode4 = (iHashCode3 + (smallActionButtonDelegate == null ? 0 : smallActionButtonDelegate.hashCode())) * 31;
        ActionWidgetDelegate actionWidgetDelegate = this.f175681h;
        return iHashCode4 + (actionWidgetDelegate != null ? actionWidgetDelegate.hashCode() : 0);
    }
}
