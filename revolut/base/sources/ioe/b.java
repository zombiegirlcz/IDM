package ioe;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0004¨\u0006$"}, d2 = {"Lioe/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "j", "()Z", "isTinIssuingCountry", "", "Lioe/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkmarks", "Lioe/h0;", "c", "Lioe/h0;", "()Lioe/h0;", "hint", "d", "Ljava/lang/String;", "h", "tinPlaceholder", "e", "f", "tinMask", "i", "tinRegexp", "g", "tinName", "tinAcronym", "tinInputTitle", "tinInputSubtitle", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isTinIssuingCountry")
    private final boolean isTinIssuingCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkmarks")
    private final List<a> checkmarks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final h0 hint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tinPlaceholder")
    private final String tinPlaceholder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tinMask")
    private final String tinMask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tinRegexp")
    private final String tinRegexp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinName")
    @NotNull
    private final String tinName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinAcronym")
    @NotNull
    private final String tinAcronym;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tinInputTitle")
    @NotNull
    private final String tinInputTitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinInputSubtitle")
    @NotNull
    private final String tinInputSubtitle;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCheckmarks() {
        return this.checkmarks;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTinAcronym() {
        return this.tinAcronym;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTinInputSubtitle() {
        return this.tinInputSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTinInputTitle() {
        return this.tinInputTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.isTinIssuingCountry == bVar.isTinIssuingCountry && Intrinsics.f(this.checkmarks, bVar.checkmarks) && Intrinsics.f(this.hint, bVar.hint) && Intrinsics.f(this.tinPlaceholder, bVar.tinPlaceholder) && Intrinsics.f(this.tinMask, bVar.tinMask) && Intrinsics.f(this.tinRegexp, bVar.tinRegexp) && Intrinsics.f(this.tinName, bVar.tinName) && Intrinsics.f(this.tinAcronym, bVar.tinAcronym) && Intrinsics.f(this.tinInputTitle, bVar.tinInputTitle) && Intrinsics.f(this.tinInputSubtitle, bVar.tinInputSubtitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTinMask() {
        return this.tinMask;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTinName() {
        return this.tinName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTinPlaceholder() {
        return this.tinPlaceholder;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isTinIssuingCountry) * 31;
        List<a> list = this.checkmarks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        h0 h0Var = this.hint;
        int iHashCode3 = (iHashCode2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        String str = this.tinPlaceholder;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tinMask;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tinRegexp;
        return this.tinInputSubtitle.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.tinName), 31, this.tinAcronym), 31, this.tinInputTitle);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTinRegexp() {
        return this.tinRegexp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTinIssuingCountry() {
        return this.isTinIssuingCountry;
    }
}
