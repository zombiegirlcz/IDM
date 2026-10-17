package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b&\u0010\u0004¨\u0006("}, d2 = {"Lq90/i4;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "n", "previousViewId", "c", "p", "title", "d", "o", "subtitle", "e", "j", "next", "f", "l", "nextText", "Lq90/u1;", "g", "Lq90/u1;", "()Lq90/u1;", "image", "h", "i", "lottieUrl", "backgroundImageUrl", "Lq90/a3;", "Lq90/a3;", "m", "()Lq90/a3;", "pollingInfo", "k", "nextActionDeeplink", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i4 extends m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousViewId")
    private final String previousViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("next")
    private final String next;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextText")
    private final String nextText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    private final u1 image;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lottieIconUrl")
    @NotNull
    private final String lottieUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("backgroundImageUrl")
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("polling")
    private final a3 pollingInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("nextActionDeeplink")
    private final String nextActionDeeplink;

    public i4(String id10, String str, String title, String str2, String str3, String str4, u1 u1Var, String lottieUrl, String str5, a3 a3Var, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        this.id = id10;
        this.previousViewId = str;
        this.title = title;
        this.subtitle = str2;
        this.next = str3;
        this.nextText = str4;
        this.image = u1Var;
        this.lottieUrl = lottieUrl;
        this.backgroundImageUrl = str5;
        this.pollingInfo = a3Var;
        this.nextActionDeeplink = str6;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.id, i4Var.id) && Intrinsics.f(this.previousViewId, i4Var.previousViewId) && Intrinsics.f(this.title, i4Var.title) && Intrinsics.f(this.subtitle, i4Var.subtitle) && Intrinsics.f(this.next, i4Var.next) && Intrinsics.f(this.nextText, i4Var.nextText) && Intrinsics.f(this.image, i4Var.image) && Intrinsics.f(this.lottieUrl, i4Var.lottieUrl) && Intrinsics.f(this.backgroundImageUrl, i4Var.backgroundImageUrl) && Intrinsics.f(this.pollingInfo, i4Var.pollingInfo) && Intrinsics.f(this.nextActionDeeplink, i4Var.nextActionDeeplink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final u1 getImage() {
        return this.image;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        String str2 = this.subtitle;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.next;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nextText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        u1 u1Var = this.image;
        int iC2 = p.a.c((iHashCode4 + (u1Var == null ? 0 : u1Var.hashCode())) * 31, 31, this.lottieUrl);
        String str5 = this.backgroundImageUrl;
        int iHashCode5 = (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a3 a3Var = this.pollingInfo;
        int iHashCode6 = (iHashCode5 + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        String str6 = this.nextActionDeeplink;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getNextActionDeeplink() {
        return this.nextActionDeeplink;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getNextText() {
        return this.nextText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a3 getPollingInfo() {
        return this.pollingInfo;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
