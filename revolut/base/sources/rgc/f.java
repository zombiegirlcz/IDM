package rgc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0012"}, d2 = {"Lrgc/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "tiny", "b", "brief", "c", "normal", "d", "f", "verbose", "terms", "picture", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tiny")
    private final String tiny;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("brief")
    private final String brief;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("normal")
    @NotNull
    private final String normal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("verbose")
    private final String verbose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("terms")
    private final String terms;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("picture")
    private final String picture;

    public f(String str, String str2, String normal, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.tiny = str;
        this.brief = str2;
        this.normal = normal;
        this.verbose = str3;
        this.terms = str4;
        this.picture = str5;
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
    public final String getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTiny() {
        return this.tiny;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.tiny, fVar.tiny) && Intrinsics.f(this.brief, fVar.brief) && Intrinsics.f(this.normal, fVar.normal) && Intrinsics.f(this.verbose, fVar.verbose) && Intrinsics.f(this.terms, fVar.terms) && Intrinsics.f(this.picture, fVar.picture);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVerbose() {
        return this.verbose;
    }

    public final int hashCode() {
        String str = this.tiny;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brief;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.normal);
        String str3 = this.verbose;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.terms;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.picture;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }
}
