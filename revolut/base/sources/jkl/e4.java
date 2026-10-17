package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0019"}, d2 = {"Ljkl/e4;", "Ljkl/i4;", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getCode", "()Ljava/lang/Integer;", "code", "b", "Ljava/lang/String;", "c", "message", "", "Ljava/util/List;", "()Ljava/util/List;", "getAcceptedAuthenticationContexts$annotations", "()V", "acceptedAuthenticationContexts", "d", "acceptedLevel", "e", "state", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e4 implements i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptedAuthenticationContexts")
    private final List<String> acceptedAuthenticationContexts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("acceptedLevel")
    private final String acceptedLevel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return this.code == e4Var.code && Intrinsics.f(this.message, e4Var.message) && Intrinsics.f(this.acceptedAuthenticationContexts, e4Var.acceptedAuthenticationContexts) && Intrinsics.f(this.acceptedLevel, e4Var.acceptedLevel) && Intrinsics.f(this.state, e4Var.state);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.acceptedAuthenticationContexts;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.acceptedLevel;
        return this.state.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
