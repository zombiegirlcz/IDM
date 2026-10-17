package ia;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lia/f;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "title", "b", "c", "subtitle", "", "Lia/g;", "Ljava/util/List;", "()Ljava/util/List;", "sections", "Lia/d;", "Lia/d;", "()Lia/d;", "continueAction", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sections")
    @NotNull
    private final List<g> sections;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("continueAction")
    @NotNull
    private final d continueAction;

    public f(String title, String str, ArrayList sections, d continueAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(continueAction, "continueAction");
        this.title = title;
        this.subtitle = str;
        this.sections = sections;
        this.continueAction = continueAction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getContinueAction() {
        return this.continueAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
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
        return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.subtitle, fVar.subtitle) && Intrinsics.f(this.sections, fVar.sections) && Intrinsics.f(this.continueAction, fVar.continueAction);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.continueAction.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sections);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<g> list = this.sections;
        d dVar = this.continueAction;
        StringBuilder sbM = v0.a.m("NavigationHubContentDto(title=", str, ", subtitle=", str2, ", sections=");
        sbM.append(list);
        sbM.append(", continueAction=");
        sbM.append(dVar);
        sbM.append(")");
        return sbM.toString();
    }
}
