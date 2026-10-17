package nt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001a"}, d2 = {"Lnt6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "mode", "b", "color", "c", "font", "", "d", "Z", "g", "()Z", "showWebsite", "f", "showEmail", "Lnt6/a;", "Lnt6/a;", "()Lnt6/a;", "backgroundImage", "logoImage", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("colour")
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
    @lg.b("backgroundImage")
    private final a backgroundImage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoImage")
    private final a logoImage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFont() {
        return this.font;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getLogoImage() {
        return this.logoImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.mode, bVar.mode) && Intrinsics.f(this.color, bVar.color) && Intrinsics.f(this.font, bVar.font) && this.showWebsite == bVar.showWebsite && this.showEmail == bVar.showEmail && Intrinsics.f(this.backgroundImage, bVar.backgroundImage) && Intrinsics.f(this.logoImage, bVar.logoImage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowEmail() {
        return this.showEmail;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowWebsite() {
        return this.showWebsite;
    }

    public final int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        String str = this.color;
        int iC = j6.a.c(j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.font), 31, this.showWebsite), 31, this.showEmail);
        a aVar = this.backgroundImage;
        int iHashCode2 = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.logoImage;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
