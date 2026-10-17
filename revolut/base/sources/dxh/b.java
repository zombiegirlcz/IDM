package dxh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Ldxh/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "Ldxh/a;", "Ldxh/a;", "()Ldxh/a;", "authenticationChallenge", "Ldxh/c;", "c", "Ldxh/c;", "()Ldxh/c;", "threeDsMethod", "feature_cpg_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("authentication_challenge")
    private final a authenticationChallenge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("three_ds_method")
    private final c threeDsMethod;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAuthenticationChallenge() {
        return this.authenticationChallenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getThreeDsMethod() {
        return this.threeDsMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.authenticationChallenge, bVar.authenticationChallenge) && Intrinsics.f(this.threeDsMethod, bVar.threeDsMethod);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        a aVar = this.authenticationChallenge;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.threeDsMethod;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
