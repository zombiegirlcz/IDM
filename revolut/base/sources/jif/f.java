package jif;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Ljif/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "image", "b", "e", "title", "c", "description", "actionTitle", "deepLink", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    private final String image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("actionTitle")
    private final String actionTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("deepLink")
    private final String deepLink;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.image, fVar.image) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.actionTitle, fVar.actionTitle) && Intrinsics.f(this.deepLink, fVar.deepLink);
    }

    public final int hashCode() {
        String str = this.image;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.description);
        String str2 = this.actionTitle;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deepLink;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
