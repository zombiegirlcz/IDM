package ql2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0013"}, d2 = {"Lql2/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "icon", "c", "d", "state", "Lql2/g;", "Lql2/g;", "()Lql2/g;", "restrictedFundsConverted", "restrictedFundsOriginal", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("restrictedFundsConverted")
    @NotNull
    private final g restrictedFundsConverted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("restrictedFundsOriginal")
    private final g restrictedFundsOriginal;

    public h(String title, String icon, String state, g restrictedFundsConverted, g gVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(restrictedFundsConverted, "restrictedFundsConverted");
        this.title = title;
        this.icon = icon;
        this.state = state;
        this.restrictedFundsConverted = restrictedFundsConverted;
        this.restrictedFundsOriginal = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getRestrictedFundsConverted() {
        return this.restrictedFundsConverted;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getRestrictedFundsOriginal() {
        return this.restrictedFundsOriginal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.icon, hVar.icon) && Intrinsics.f(this.state, hVar.state) && Intrinsics.f(this.restrictedFundsConverted, hVar.restrictedFundsConverted) && Intrinsics.f(this.restrictedFundsOriginal, hVar.restrictedFundsOriginal);
    }

    public final int hashCode() {
        int iHashCode = (this.restrictedFundsConverted.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.icon), 31, this.state)) * 31;
        g gVar = this.restrictedFundsOriginal;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
