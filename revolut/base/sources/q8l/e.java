package q8l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u001a"}, d2 = {"Lq8l/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "description", "c", "getBackgroundImage", "backgroundImage", "d", "e", "status", "", "Ljava/util/List;", "()Ljava/util/List;", "restrictions", "Lq8l/d;", "actions", "Lq8l/c;", "g", "moreInfo", "feature_shared_offboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundImage")
    @NotNull
    private final String backgroundImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("restrictions")
    private final List<String> restrictions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("actions")
    @NotNull
    private final List<d> actions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("moreInfo")
    private final List<c> moreInfo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getMoreInfo() {
        return this.moreInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getRestrictions() {
        return this.restrictions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.backgroundImage, eVar.backgroundImage) && Intrinsics.f(this.status, eVar.status) && Intrinsics.f(this.restrictions, eVar.restrictions) && Intrinsics.f(this.actions, eVar.actions) && Intrinsics.f(this.moreInfo, eVar.moreInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundImage);
        String str2 = this.status;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.restrictions;
        int iD = p.a.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.actions);
        List<c> list2 = this.moreInfo;
        return iD + (list2 != null ? list2.hashCode() : 0);
    }
}
