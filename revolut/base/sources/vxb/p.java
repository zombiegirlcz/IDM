package vxb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lvxb/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "minimumSelectionCount", "", "Lvxb/o;", "Ljava/util/List;", "c", "()Ljava/util/List;", "preferences", "Lm1c/p1;", "Lm1c/p1;", "()Lm1c/p1;", "disclaimer", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumSelectionCount")
    private final int minimumSelectionCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferences")
    @NotNull
    private final List<o> preferences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final p1 disclaimer;

    public p(int i, ArrayList preferences, p1 p1Var) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.minimumSelectionCount = i;
        this.preferences = preferences;
        this.disclaimer = p1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p1 getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMinimumSelectionCount() {
        return this.minimumSelectionCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPreferences() {
        return this.preferences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.minimumSelectionCount == pVar.minimumSelectionCount && Intrinsics.f(this.preferences, pVar.preferences) && Intrinsics.f(this.disclaimer, pVar.disclaimer);
    }

    public final int hashCode() {
        int iD = p.a.d(Integer.hashCode(this.minimumSelectionCount) * 31, 31, this.preferences);
        p1 p1Var = this.disclaimer;
        return iD + (p1Var == null ? 0 : p1Var.hashCode());
    }
}
