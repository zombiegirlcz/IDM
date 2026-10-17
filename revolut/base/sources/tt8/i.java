package tt8;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0010"}, d2 = {"Ltt8/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "F", "b", "()F", "left", "c", "top", "d", "width", "height", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("left")
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("top")
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("width")
    private final float width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("height")
    private final float height;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Float.compare(this.left, iVar.left) == 0 && Float.compare(this.top, iVar.top) == 0 && Float.compare(this.width, iVar.width) == 0 && Float.compare(this.height, iVar.height) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.height) + m72.b.b(this.width, m72.b.b(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }
}
