package ufc;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lufc/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "hasCardReader", "Companion", "feature_revpro_pro_merchant_toggles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasCardReader")
    private final boolean hasCardReader;

    public b(boolean z) {
        this.hasCardReader = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasCardReader() {
        return this.hasCardReader;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.hasCardReader == ((b) obj2).hasCardReader;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasCardReader);
    }
}
