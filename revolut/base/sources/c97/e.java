package c97;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc97/e;", "", "", "toString", "()Ljava/lang/String;", "", "Lc97/f;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "results", "Lc97/g;", "Lc97/g;", "()Lc97/g;", "preferences", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("results")
    @NotNull
    private final List<f> results;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferences")
    private final g preferences;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getPreferences() {
        return this.preferences;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getResults() {
        return this.results;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.results, eVar.results) && Intrinsics.f(this.preferences, eVar.preferences);
    }

    public final int hashCode() {
        int iHashCode = this.results.hashCode() * 31;
        g gVar = this.preferences;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
