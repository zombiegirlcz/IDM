package lrh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Llrh/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "code", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "getAcceptedAuthenticationContexts$annotations", "()V", "acceptedAuthenticationContexts", "Ljava/lang/String;", "acceptedLevel", "d", "state", "feature_wealth_protection_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptedAuthenticationContexts")
    private final List<String> acceptedAuthenticationContexts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptedLevel")
    private final String acceptedLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAcceptedAuthenticationContexts() {
        return this.acceptedAuthenticationContexts;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAcceptedLevel() {
        return this.acceptedLevel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.code == bVar.code && Intrinsics.f(this.acceptedAuthenticationContexts, bVar.acceptedAuthenticationContexts) && Intrinsics.f(this.acceptedLevel, bVar.acceptedLevel) && Intrinsics.f(this.state, bVar.state);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        List<String> list = this.acceptedAuthenticationContexts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.acceptedLevel;
        return this.state.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
