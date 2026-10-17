package dng;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0019"}, d2 = {"Ldng/h;", "", "", "toString", "()Ljava/lang/String;", "Ldng/k;", "a", "Ldng/k;", "c", "()Ldng/k;", "user", "Ldng/a;", "b", "Ldng/a;", "()Ldng/a;", "individual", "", "Ldng/b;", "Ljava/util/List;", "()Ljava/util/List;", "profiles", "d", "Ljava/lang/String;", "getAppMode", "appMode", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("user")
    private final k user;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("individual")
    @NotNull
    private final a individual;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("profiles")
    @NotNull
    private final List<b> profiles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("appMode")
    private final String appMode;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getIndividual() {
        return this.individual;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getProfiles() {
        return this.profiles;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getUser() {
        return this.user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.user, hVar.user) && Intrinsics.f(this.individual, hVar.individual) && Intrinsics.f(this.profiles, hVar.profiles) && Intrinsics.f(this.appMode, hVar.appMode);
    }

    public final int hashCode() {
        k kVar = this.user;
        int iD = p.a.d((this.individual.hashCode() + ((kVar == null ? 0 : kVar.hashCode()) * 31)) * 31, 31, this.profiles);
        String str = this.appMode;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
