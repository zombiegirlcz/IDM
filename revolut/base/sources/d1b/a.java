package d1b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Ld1b/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBackground", "background", "b", "getForeground", "foreground", "c", "getGrid", "grid", "d", "getUp", "up", "e", "getDown", "down", "f", "getWick", "wick", "g", "getSeparator", "separator", "h", "getControlsBackground", "controlsBackground", "i", "getControlsIcon", "controlsIcon", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("background")
    @NotNull
    private final String background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("foreground")
    @NotNull
    private final String foreground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("grid")
    @NotNull
    private final String grid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("up")
    @NotNull
    private final String up;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("down")
    @NotNull
    private final String down;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("wick")
    private final String wick;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("separator")
    private final String separator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("controlsBackground")
    private final String controlsBackground;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("controlsIcon")
    private final String controlsIcon;

    public a(String background, String foreground, String grid, String up6, String down, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(foreground, "foreground");
        Intrinsics.checkNotNullParameter(grid, "grid");
        Intrinsics.checkNotNullParameter(up6, "up");
        Intrinsics.checkNotNullParameter(down, "down");
        this.background = background;
        this.foreground = foreground;
        this.grid = grid;
        this.up = up6;
        this.down = down;
        this.wick = str;
        this.separator = str2;
        this.controlsBackground = str3;
        this.controlsIcon = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.background, aVar.background) && Intrinsics.f(this.foreground, aVar.foreground) && Intrinsics.f(this.grid, aVar.grid) && Intrinsics.f(this.up, aVar.up) && Intrinsics.f(this.down, aVar.down) && Intrinsics.f(this.wick, aVar.wick) && Intrinsics.f(this.separator, aVar.separator) && Intrinsics.f(this.controlsBackground, aVar.controlsBackground) && Intrinsics.f(this.controlsIcon, aVar.controlsIcon);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.background.hashCode() * 31, 31, this.foreground), 31, this.grid), 31, this.up), 31, this.down);
        String str = this.wick;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.separator;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.controlsBackground;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.controlsIcon;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
