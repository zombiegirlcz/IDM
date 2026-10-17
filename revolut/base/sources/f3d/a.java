package f3d;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements csh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1d.d f131932b;

    public a(v1d.d titleProvider, int i) {
        this.f131931a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                this.f131932b = titleProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
                this.f131932b = titleProvider;
                break;
        }
    }

    @Override // csh.d
    public final Clause a() {
        switch (this.f131931a) {
        }
        return this.f131932b.d();
    }

    @Override // csh.d
    public final List c() {
        switch (this.f131931a) {
            case 0:
                return u.c("SymbolStandalone");
            default:
                return u.c("WatchlistSymbol");
        }
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        switch (this.f131931a) {
            case 0:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                break;
            default:
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                break;
        }
        return this.f131932b.a();
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        switch (this.f131931a) {
            case 0:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                return "SymbolStandalone";
            default:
                Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
                String str = availableWidgetTypes.contains("WatchlistSymbol") ? "WatchlistSymbol" : null;
                return str == null ? (String) d0.b0(availableWidgetTypes) : str;
        }
    }
}
