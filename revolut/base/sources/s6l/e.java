package s6l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ls6l/e;", "", "", "toString", "()Ljava/lang/String;", "", "Ls6l/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "area", "b", "Ljava/lang/String;", "c", "color", "getBackgroundUrl$annotations", "()V", "backgroundUrl", "Ls6l/o;", "d", "Ls6l/o;", "()Ls6l/o;", "pricing", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("area")
    @NotNull
    private final List<a> area;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("color")
    @NotNull
    private final String color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundUrl")
    @NotNull
    private final String backgroundUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final o pricing;

    public e(ArrayList area, String color, String backgroundUrl, o pricing) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.area = area;
        this.color = color;
        this.backgroundUrl = backgroundUrl;
        this.pricing = pricing;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getArea() {
        return this.area;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getPricing() {
        return this.pricing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.area, eVar.area) && Intrinsics.f(this.color, eVar.color) && Intrinsics.f(this.backgroundUrl, eVar.backgroundUrl) && Intrinsics.f(this.pricing, eVar.pricing);
    }

    public final int hashCode() {
        return this.pricing.hashCode() + p.a.c(p.a.c(this.area.hashCode() * 31, 31, this.color), 31, this.backgroundUrl);
    }
}
