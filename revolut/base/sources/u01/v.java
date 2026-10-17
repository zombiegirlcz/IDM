package u01;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f276030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s01.b f276031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.a f276032c;
    public final s01.a d;
    public final s01.c e;
    public final s01.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s01.c f276033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s01.a f276034h;
    public final s01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s01.b f276035j;

    public v(Handler uiHandler, s01.b widgetReady, s01.a barsInfoRequested, s01.a latestBarsInfoRequested, s01.c studyEvent, s01.c indicatorAdded, s01.c symbolAdded, s01.a symbolNameRequested, s01.a modifyPositionLine, s01.b timeframeInvalidated) {
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(widgetReady, "widgetReady");
        Intrinsics.checkNotNullParameter(barsInfoRequested, "barsInfoRequested");
        Intrinsics.checkNotNullParameter(latestBarsInfoRequested, "latestBarsInfoRequested");
        Intrinsics.checkNotNullParameter(studyEvent, "studyEvent");
        Intrinsics.checkNotNullParameter(indicatorAdded, "indicatorAdded");
        Intrinsics.checkNotNullParameter(symbolAdded, "symbolAdded");
        Intrinsics.checkNotNullParameter(symbolNameRequested, "symbolNameRequested");
        Intrinsics.checkNotNullParameter(modifyPositionLine, "modifyPositionLine");
        Intrinsics.checkNotNullParameter(timeframeInvalidated, "timeframeInvalidated");
        this.f276030a = uiHandler;
        this.f276031b = widgetReady;
        this.f276032c = barsInfoRequested;
        this.d = latestBarsInfoRequested;
        this.e = studyEvent;
        this.f = indicatorAdded;
        this.f276033g = symbolAdded;
        this.f276034h = symbolNameRequested;
        this.i = modifyPositionLine;
        this.f276035j = timeframeInvalidated;
    }

    @JavascriptInterface
    public final boolean onBarsInfoRequested(@NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return this.f276030a.post(new s(this, info, 3));
    }

    @JavascriptInterface
    public final boolean onIndicatorAdded(@NotNull String id10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f276030a.post(new t(this, id10, name, 0));
    }

    @JavascriptInterface
    public final boolean onLatestBarsInfoRequested(@NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return this.f276030a.post(new s(this, info, 2));
    }

    @JavascriptInterface
    public final boolean onModifyPositionLine(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f276030a.post(new s(this, id10, 1));
    }

    @JavascriptInterface
    public final boolean onStudyEvent(@NotNull String id10, @NotNull String eventType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return this.f276030a.post(new t(this, id10, eventType, 1));
    }

    @JavascriptInterface
    public final boolean onSymbolAdded(@NotNull String id10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f276030a.post(new t(this, id10, name, 2));
    }

    @JavascriptInterface
    public final boolean onSymbolNameRequested(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f276030a.post(new s(this, symbol, 0));
    }

    @JavascriptInterface
    public final boolean onTimeframeInvalidated() {
        return this.f276030a.post(new u(this, 1));
    }

    @JavascriptInterface
    public final boolean onWidgetReady() {
        return this.f276030a.post(new u(this, 0));
    }
}
