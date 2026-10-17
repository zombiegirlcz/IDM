package n6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"Ln6l/d;", "", "", "toString", "()Ljava/lang/String;", "Ln6l/c;", "a", "Ln6l/c;", "b", "()Ln6l/c;", "assets3d", "Ln6l/b;", "Ln6l/b;", "()Ln6l/b;", "assets2d", "Ln6l/q;", "c", "Ln6l/q;", "e", "()Ln6l/q;", "videoBackground", "Ln6l/r;", "d", "Ln6l/r;", "()Ln6l/r;", "colorPicker", "Ln6l/e;", "Ln6l/e;", "()Ln6l/e;", "catalogue", "Ln6l/k;", "f", "Ln6l/k;", "()Ln6l/k;", "videoPreview", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("3d")
    private final c assets3d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("2d")
    private final b assets2d;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("videoBackground")
    private final q videoBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("colourPicker")
    private final r colorPicker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("catalogue")
    private final e catalogue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("videoPreview")
    private final k videoPreview;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAssets2d() {
        return this.assets2d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getAssets3d() {
        return this.assets3d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getCatalogue() {
        return this.catalogue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r getColorPicker() {
        return this.colorPicker;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getVideoBackground() {
        return this.videoBackground;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.assets3d, dVar.assets3d) && Intrinsics.f(this.assets2d, dVar.assets2d) && Intrinsics.f(this.videoBackground, dVar.videoBackground) && Intrinsics.f(this.colorPicker, dVar.colorPicker) && Intrinsics.f(this.catalogue, dVar.catalogue) && Intrinsics.f(this.videoPreview, dVar.videoPreview);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getVideoPreview() {
        return this.videoPreview;
    }

    public final int hashCode() {
        c cVar = this.assets3d;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.assets2d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        q qVar = this.videoBackground;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        r rVar = this.colorPicker;
        int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        e eVar = this.catalogue;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        k kVar = this.videoPreview;
        return iHashCode5 + (kVar != null ? kVar.hashCode() : 0);
    }
}
