package n6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Ln6l/z;", "", "", "toString", "()Ljava/lang/String;", "Ln6l/y;", "a", "Ln6l/y;", "()Ln6l/y;", "assets", "Ln6l/q;", "b", "Ln6l/q;", "d", "()Ln6l/q;", "videoBackground", "Ln6l/r;", "c", "Ln6l/r;", "()Ln6l/r;", "colorPicker", "Ln6l/e;", "Ln6l/e;", "()Ln6l/e;", "catalogue", "Ln6l/k;", "e", "Ln6l/k;", "()Ln6l/k;", "videoPreview", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("3d")
    private final y assets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("videoBackground")
    private final q videoBackground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("colourPicker")
    private final r colorPicker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("catalogue")
    private final e catalogue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("videoPreview")
    private final k videoPreview;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final y getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getCatalogue() {
        return this.catalogue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getColorPicker() {
        return this.colorPicker;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q getVideoBackground() {
        return this.videoBackground;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getVideoPreview() {
        return this.videoPreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.assets, zVar.assets) && Intrinsics.f(this.videoBackground, zVar.videoBackground) && Intrinsics.f(this.colorPicker, zVar.colorPicker) && Intrinsics.f(this.catalogue, zVar.catalogue) && Intrinsics.f(this.videoPreview, zVar.videoPreview);
    }

    public final int hashCode() {
        y yVar = this.assets;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        q qVar = this.videoBackground;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        r rVar = this.colorPicker;
        int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        e eVar = this.catalogue;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        k kVar = this.videoPreview;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }
}
