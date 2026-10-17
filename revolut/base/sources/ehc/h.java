package ehc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000f"}, d2 = {"Lehc/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "brief", "b", "normal", "c", "d", "verbose", "picture", "Companion", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brief")
    private final String brief;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("normal")
    @NotNull
    private final String normal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("verbose")
    private final String verbose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("picture")
    private final String picture;

    public h(String str, String normal, String str2, String str3) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.brief = str;
        this.normal = normal;
        this.verbose = str2;
        this.picture = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrief() {
        return this.brief;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVerbose() {
        return this.verbose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.brief, hVar.brief) && Intrinsics.f(this.normal, hVar.normal) && Intrinsics.f(this.verbose, hVar.verbose) && Intrinsics.f(this.picture, hVar.picture);
    }

    public final int hashCode() {
        String str = this.brief;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.normal);
        String str2 = this.verbose;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.picture;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
