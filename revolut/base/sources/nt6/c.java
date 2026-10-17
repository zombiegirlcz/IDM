package nt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lnt6/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAppearanceMode", "appearanceMode", "b", "getColor", "color", "c", "getFont", "font", "", "d", "Z", "getShowWebsite", "()Z", "showWebsite", "e", "getShowEmail", "showEmail", "f", "getBackgroundImageId", "backgroundImageId", "g", "getLogoImageId", "logoImageId", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String appearanceMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("colour")
    @NotNull
    private final String color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("font")
    @NotNull
    private final String font;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("showWebsite")
    private final boolean showWebsite;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("showEmail")
    private final boolean showEmail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("backgroundImageId")
    @NotNull
    private final String backgroundImageId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoImageId")
    @NotNull
    private final String logoImageId;

    public c(String appearanceMode, String color, String font, boolean z, boolean z3, String backgroundImageId, String logoImageId) {
        Intrinsics.checkNotNullParameter(appearanceMode, "appearanceMode");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(backgroundImageId, "backgroundImageId");
        Intrinsics.checkNotNullParameter(logoImageId, "logoImageId");
        this.appearanceMode = appearanceMode;
        this.color = color;
        this.font = font;
        this.showWebsite = z;
        this.showEmail = z3;
        this.backgroundImageId = backgroundImageId;
        this.logoImageId = logoImageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.appearanceMode, cVar.appearanceMode) && Intrinsics.f(this.color, cVar.color) && Intrinsics.f(this.font, cVar.font) && this.showWebsite == cVar.showWebsite && this.showEmail == cVar.showEmail && Intrinsics.f(this.backgroundImageId, cVar.backgroundImageId) && Intrinsics.f(this.logoImageId, cVar.logoImageId);
    }

    public final int hashCode() {
        return this.logoImageId.hashCode() + p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.appearanceMode.hashCode() * 31, 31, this.color), 31, this.font), 31, this.showWebsite), 31, this.showEmail), 31, this.backgroundImageId);
    }
}
