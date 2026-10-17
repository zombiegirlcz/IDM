package cg0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcg0/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "key", "b", "f", "title", "c", "contentStyle", "d", "deeplink", "iconUri", "", "Lcg0/y;", "Ljava/util/List;", "()Ljava/util/List;", "children", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentStyle")
    @NotNull
    private final String contentStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("deeplink")
    private final String deeplink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("iconUri")
    private final String iconUri;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("children")
    private final List<y> children;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContentStyle() {
        return this.contentStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.key, xVar.key) && Intrinsics.f(this.title, xVar.title) && Intrinsics.f(this.contentStyle, xVar.contentStyle) && Intrinsics.f(this.deeplink, xVar.deeplink) && Intrinsics.f(this.iconUri, xVar.iconUri) && Intrinsics.f(this.children, xVar.children);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.key.hashCode() * 31, 31, this.title), 31, this.contentStyle);
        String str = this.deeplink;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<y> list = this.children;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
